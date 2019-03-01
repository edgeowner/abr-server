package source.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import source.entity.WorkTimeAvg;
import source.entity.WorkTimeAvgExample;

public interface WorkTimeAvgMapper {
    long countByExample(WorkTimeAvgExample example);

    int deleteByExample(WorkTimeAvgExample example);

    int insert(WorkTimeAvg record);

    int insertSelective(WorkTimeAvg record);

    List<WorkTimeAvg> selectByExample(WorkTimeAvgExample example);

    int updateByExampleSelective(@Param("record") WorkTimeAvg record, @Param("example") WorkTimeAvgExample example);

    int updateByExample(@Param("record") WorkTimeAvg record, @Param("example") WorkTimeAvgExample example);
}