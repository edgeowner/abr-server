package com.atmatrix.abr.infrastructure.dao;

import com.atmatrix.abr.common.constants.DeleteEnum;
import com.atmatrix.abr.common.constants.QueryDicTypeEnum;
import com.atmatrix.abr.common.constants.ShowStatusEnum;
import com.atmatrix.abr.infrastructure.entity.RobotDictionary;
import com.atmatrix.abr.infrastructure.entity.RobotWorktype;
import com.google.common.collect.Lists;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class RobotWorktypeMapperTest  extends BaseTest{


    @Autowired
    private RobotWorktypeMapper robotWorktypeMapper;
    @Autowired
    private RobotDictionaryMapper robotDictionaryMapper;

    @Test
    public void getAll() {

        List<RobotDictionary> listToSave = Lists.newArrayList();
        List<RobotWorktype> all = robotWorktypeMapper.getAll();
        RobotDictionary dto = null;
        int i = 0;
        for (RobotWorktype robotWorktype:all) {
            dto = new RobotDictionary();
            dto.setSort(++i);
            dto.setParentName(robotWorktype.getWorktypeName());
            dto.setParentCode(robotWorktype.getUnionCode());
            dto.setDelete(DeleteEnum.TRUE.getCode());
            dto.setShowStatus(ShowStatusEnum.TRUE.getCode());
            dto.setLevel(1);
            dto.setType(QueryDicTypeEnum.WORK_TYPE.getName());
            dto.setCode(robotWorktype.getUnionCode());
            dto.setName(robotWorktype.getWorktypeName());
            listToSave.add(dto);
        }
        robotDictionaryMapper.batchInsert(listToSave);
        System.out.println(all);
    }
}