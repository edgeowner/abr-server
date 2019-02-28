package com.atmatrix.abr.mgt;

import com.atmatrix.abr.infrastructure.entity.UserAccount;

public interface UserAccountMgt {
    void saveUserAccount(UserAccount userAccount);

    void updateUserAccount(UserAccount buildUserAccount);
}
