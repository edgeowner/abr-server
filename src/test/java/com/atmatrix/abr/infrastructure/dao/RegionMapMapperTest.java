package com.atmatrix.abr.infrastructure.dao;

import com.atmatrix.abr.common.constants.DeleteEnum;
import com.atmatrix.abr.common.constants.QueryDicTypeEnum;
import com.atmatrix.abr.common.constants.ShowStatusEnum;
import com.atmatrix.abr.infrastructure.entity.RegionMap;
import com.atmatrix.abr.infrastructure.entity.RobotDictionary;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;


public class RegionMapMapperTest extends BaseTest {

    @Autowired
    private RegionMapMapper regionMapMapper;


    @Autowired
    private RobotDictionaryMapper robotDictionaryMapper;

    @Test
    public void getAll() {
        List<RegionMap> allList = regionMapMapper.getAll();
        System.out.println(allList);
        System.out.println(allList.size());

        Map<Integer, RegionMap> province = Maps.newHashMap();
        Map<String, List<RobotDictionary>> toInsertListMap = Maps.newHashMap();
        List<RobotDictionary> toSave;
        for (RegionMap regionMap : allList) {
            Integer regionCode = Integer.valueOf(regionMap.getRegionCode());
            Integer re = regionCode % 10000;
            if (re == 0) {
                Integer result = (Integer) regionCode / 10000;
                province.put(result, regionMap);
            }
        }

        Set<String> citys = Sets.newHashSet("北京市", "天津市", "上海市", "重庆市");
//


        for (Map.Entry<Integer, RegionMap> entry : province.entrySet()) {
            Integer key = entry.getKey();
            String keycode = String.valueOf(key * 10000);
            RegionMap regionParent = entry.getValue();
            int i = 0;
            List<RobotDictionary> list = Lists.newArrayList();
            for (RegionMap regionMap : allList) {
                Integer childRegionCode = Integer.valueOf(regionMap.getRegionCode());
                Integer _re = (int) childRegionCode / 10000;
                if (_re.equals(key)) {
                    Integer less = childRegionCode % 10000;
                    if (0 == less) {
                        RobotDictionary parent = new RobotDictionary();
                        parent.setCode(regionParent.getRegionCode());
                        parent.setName(regionParent.getRegionName());
                        parent.setLevel(Integer.valueOf(regionParent.getRegionLevel()));
                        if (citys.contains(regionParent.getRegionName())) {
                            parent.setParentCode(regionParent.getRegionCode());
                            parent.setParentName("市辖区");
                        } else {
                            parent.setParentCode(regionParent.getRegionCode());
                            parent.setParentName("省份");
                        }

                        parent.setShowStatus(ShowStatusEnum.TRUE.getCode());
                        parent.setDelete(DeleteEnum.TRUE.getCode());
                        parent.setType(QueryDicTypeEnum.REGION.getName());
                        parent.setSort(++i);
                        list.add(parent);
                    } else {
                        RobotDictionary child = new RobotDictionary();
                        child.setCode(regionMap.getRegionCode());
                        child.setName(regionMap.getRegionName());
                        child.setLevel(Integer.valueOf(regionMap.getRegionLevel()));
                        child.setParentCode(regionParent.getRegionCode());
                        child.setParentName(regionParent.getRegionName());
                        child.setShowStatus(ShowStatusEnum.TRUE.getCode());
                        child.setDelete(DeleteEnum.TRUE.getCode());
                        child.setType(QueryDicTypeEnum.REGION.getName());
                        child.setSort(++i);
                        list.add(child);
                    }

                }
            }
            toInsertListMap.put(keycode, list);
        }
        System.out.println(toInsertListMap);

        List<Map.Entry<String, List<RobotDictionary>>> list = new ArrayList<Map.Entry<String, List<RobotDictionary>>>(toInsertListMap.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, List<RobotDictionary>>>() {
            @Override
            public int compare(Map.Entry<String, List<RobotDictionary>> o1, Map.Entry<String, List<RobotDictionary>> o2) {
                Integer o1key = Integer.valueOf(o1.getKey());
                Integer o2key = Integer.valueOf(o2.getKey());
                return o1key.compareTo(o2key);
            }
        });

        Map<String, List<RobotDictionary>> treeMap = new TreeMap<String, List<RobotDictionary>>(toInsertListMap);
        System.out.println(treeMap);
        for (Map.Entry<String, List<RobotDictionary>> entry : treeMap.entrySet()) {
            List<RobotDictionary> listToSave = entry.getValue();
            robotDictionaryMapper.batchInsert(listToSave);
        }


    }
}