package source.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import source.entity.RentAddress;
import source.entity.RentAddressExample;

public interface RentAddressMapper {
    long countByExample(RentAddressExample example);

    int deleteByExample(RentAddressExample example);

    int insert(RentAddress record);

    int insertSelective(RentAddress record);

    List<RentAddress> selectByExample(RentAddressExample example);

    int updateByExampleSelective(@Param("record") RentAddress record, @Param("example") RentAddressExample example);

    int updateByExample(@Param("record") RentAddress record, @Param("example") RentAddressExample example);
}