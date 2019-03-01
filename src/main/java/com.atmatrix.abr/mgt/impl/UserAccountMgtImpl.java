package com.atmatrix.abr.mgt.impl;

import com.atmatrix.abr.infrastructure.dao.UserAccountMapper;
import com.atmatrix.abr.infrastructure.entity.UserAccount;
import com.atmatrix.abr.infrastructure.entity.UserAccountExample;
import com.atmatrix.abr.mgt.UserAccountMgt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: abr-server
 * @ClassName: UserAccountMgtImpl
 * @Description:
 * @Author: edgeowner
 * @Create: 2019-02-28 11:39 AM
 **/

@Component
public class UserAccountMgtImpl implements UserAccountMgt {

    @Autowired
    private UserAccountMapper userAccountMapper;

    @Override
    public void saveUserAccount(UserAccount userAccount) {
        if (userAccount == null) {
            return;
        }
        userAccountMapper.insert(userAccount);
    }


    @Override
    public void updateUserAccount(UserAccount userAccount) {
        if (userAccount == null) {
            return;
        }
        UserAccountExample example = new UserAccountExample();
        UserAccountExample.Criteria criteria = example.createCriteria();
        criteria.andUnionCodeEqualTo(userAccount.getUnionCode());
        userAccountMapper.updateByExampleSelective(userAccount, example);
    }
}
