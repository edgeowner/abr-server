package com.atmatrix.abr.infrastructure.dao;

import com.atmatrix.abr.infrastructure.entity.UserAccount;
import com.atmatrix.abr.infrastructure.entity.UserAccountExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ProjectName: abr-server
 * @ClassName: UserAccountMapper
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-02-27 4:03 PM
 **/

public interface UserAccountMapper {
    long countByExample(UserAccountExample example);

    int deleteByExample(UserAccountExample example);

    int insert(UserAccount record);

    int insertSelective(UserAccount record);

    List<UserAccount> selectByExample(UserAccountExample example);

    int updateByExampleSelective(@Param("record") UserAccount record, @Param("example") UserAccountExample example);

    int updateByExample(@Param("record") UserAccount record, @Param("example") UserAccountExample example);

}
