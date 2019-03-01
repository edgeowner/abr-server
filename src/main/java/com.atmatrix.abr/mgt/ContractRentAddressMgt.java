package com.atmatrix.abr.mgt;

import com.atmatrix.abr.mgt.dto.ContractRentAddressDto;

/**
 * @ProjectName: abr-server
 * @ClassName: ContractRentAddressMgt
 * @Description:
 * @Author: edgeowner
 * @Create: 2019-02-28 6:41 PM
 **/

public interface ContractRentAddressMgt {

    void saveAddress(ContractRentAddressDto insert);

    void updateAddress(ContractRentAddressDto update);

}
