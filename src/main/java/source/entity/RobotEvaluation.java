package source.entity;

import java.util.Date;

public class RobotEvaluation {
    private Integer id;

    private String unionCode;

    private String robotUnionCode;

    private String workTypeCode;

    private String efficiency;

    private String score;

    private Integer delete;

    private Integer lastFlag;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUnionCode() {
        return unionCode;
    }

    public void setUnionCode(String unionCode) {
        this.unionCode = unionCode == null ? null : unionCode.trim();
    }

    public String getRobotUnionCode() {
        return robotUnionCode;
    }

    public void setRobotUnionCode(String robotUnionCode) {
        this.robotUnionCode = robotUnionCode == null ? null : robotUnionCode.trim();
    }

    public String getWorkTypeCode() {
        return workTypeCode;
    }

    public void setWorkTypeCode(String workTypeCode) {
        this.workTypeCode = workTypeCode == null ? null : workTypeCode.trim();
    }

    public String getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(String efficiency) {
        this.efficiency = efficiency == null ? null : efficiency.trim();
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score == null ? null : score.trim();
    }

    public Integer getDelete() {
        return delete;
    }

    public void setDelete(Integer delete) {
        this.delete = delete;
    }

    public Integer getLastFlag() {
        return lastFlag;
    }

    public void setLastFlag(Integer lastFlag) {
        this.lastFlag = lastFlag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}