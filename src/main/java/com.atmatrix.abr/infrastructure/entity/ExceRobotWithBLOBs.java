package com.atmatrix.abr.infrastructure.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class ExceRobotWithBLOBs extends ExceRobot {
    private String reason;
}