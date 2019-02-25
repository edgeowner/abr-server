package com.atmatrix.abr.infrastructure.entity;

import java.io.Serializable;

public class RobotWorktypeWithBLOBs extends RobotWorktype implements Serializable {
    private String worktypeDesc;

    private static final long serialVersionUID = 1L;

    public String getWorktypeDesc() {
        return worktypeDesc;
    }

    public void setWorktypeDesc(String worktypeDesc) {
        this.worktypeDesc = worktypeDesc == null ? null : worktypeDesc.trim();
    }
}