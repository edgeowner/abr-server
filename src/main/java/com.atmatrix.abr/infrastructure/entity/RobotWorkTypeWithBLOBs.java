package com.atmatrix.abr.infrastructure.entity;


import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class RobotWorkTypeWithBLOBs extends RobotWorkType {
    private String worktypeDesc;
}