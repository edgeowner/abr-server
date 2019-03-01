package source.entity;

import java.util.Date;

public class WorkTimeAvg {
    private Integer id;

    private String robotUnionCode;

    private Double avgWorkHour;

    private Double totalWorkHour;

    private Integer delete;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRobotUnionCode() {
        return robotUnionCode;
    }

    public void setRobotUnionCode(String robotUnionCode) {
        this.robotUnionCode = robotUnionCode == null ? null : robotUnionCode.trim();
    }

    public Double getAvgWorkHour() {
        return avgWorkHour;
    }

    public void setAvgWorkHour(Double avgWorkHour) {
        this.avgWorkHour = avgWorkHour;
    }

    public Double getTotalWorkHour() {
        return totalWorkHour;
    }

    public void setTotalWorkHour(Double totalWorkHour) {
        this.totalWorkHour = totalWorkHour;
    }

    public Integer getDelete() {
        return delete;
    }

    public void setDelete(Integer delete) {
        this.delete = delete;
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