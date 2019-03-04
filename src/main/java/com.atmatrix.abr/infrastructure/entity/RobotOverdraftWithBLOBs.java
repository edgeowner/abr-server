package com.atmatrix.abr.infrastructure.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class RobotOverdraftWithBLOBs extends RobotOverdraft {
    private String referenceDesc;
}