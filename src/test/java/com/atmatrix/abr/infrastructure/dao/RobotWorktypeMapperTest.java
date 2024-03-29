package com.atmatrix.abr.infrastructure.dao;

import com.atmatrix.abr.common.constants.DeleteEnum;
import com.atmatrix.abr.common.constants.QueryDicTypeEnum;
import com.atmatrix.abr.common.constants.ShowStatusEnum;
import com.atmatrix.abr.infrastructure.entity.RobotDictionary;
import com.atmatrix.abr.infrastructure.entity.WorkType;
import com.google.common.collect.Lists;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class RobotWorktypeMapperTest  extends BaseTest{


    @Autowired
    private RobotWorkTypeMapper robotWorkTypeMapper;
    @Autowired
    private RobotDictionaryMapper robotDictionaryMapper;

    @Test
    public void getAll() {

        List<RobotDictionary> listToSave = Lists.newArrayList();
        List<WorkType> all = robotWorkTypeMapper.getAll();
        RobotDictionary dto = null;
        int i = 0;
        for (WorkType worktype :all) {
            dto = new RobotDictionary();
            dto.setSort(++i);
            dto.setParentName(worktype.getWorktypeName());
            dto.setParentCode(worktype.getUnionCode());
            dto.setDelete(DeleteEnum.TRUE.getCode());
            dto.setShowStatus(ShowStatusEnum.TRUE.getCode());
            dto.setLevel(1);
            dto.setType(QueryDicTypeEnum.WORK_TYPE.getName());
            dto.setCode(worktype.getUnionCode());
            dto.setName(worktype.getWorktypeName());
            listToSave.add(dto);
        }
        robotDictionaryMapper.batchInsert(listToSave);
        System.out.println(all);
    }
}