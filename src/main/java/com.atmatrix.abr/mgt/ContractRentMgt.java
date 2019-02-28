package com.atmatrix.abr.mgt;

import com.atmatrix.abr.application.dto.rent.RentContractDto;

public interface ContractRentMgt {

    RentContractDto queryByRobotUnionCode(String robotUnionCode);

    String saveRentInfo(RentContractDto dto);

    String updateRentInfo(RentContractDto dto);
}
