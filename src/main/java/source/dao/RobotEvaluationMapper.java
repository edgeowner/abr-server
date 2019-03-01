package source.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import source.entity.RobotEvaluation;
import source.entity.RobotEvaluationExample;

public interface RobotEvaluationMapper {
    long countByExample(RobotEvaluationExample example);

    int deleteByExample(RobotEvaluationExample example);

    int insert(RobotEvaluation record);

    int insertSelective(RobotEvaluation record);

    List<RobotEvaluation> selectByExample(RobotEvaluationExample example);

    int updateByExampleSelective(@Param("record") RobotEvaluation record, @Param("example") RobotEvaluationExample example);

    int updateByExample(@Param("record") RobotEvaluation record, @Param("example") RobotEvaluationExample example);
}