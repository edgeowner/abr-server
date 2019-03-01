package com.atmatrix.abr.controller;

import com.atmatrix.abr.application.ContractApplication;
import com.atmatrix.abr.application.dto.condtion.CommonQueryCondDto;
import com.atmatrix.abr.application.dto.rent.RentContractDto;
import com.atmatrix.abr.common.web.WebUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.MessageFormat;
import java.util.Map;

/**
 * @ProjectName: abr-server
 * @ClassName: ContactController
 * @Description:
 * @Author: edgeowner
 * @Create: 2019-02-27 8:31 PM
 **/

@Slf4j
@RestController
@Api(tags = "ContactController", description = "出租合约接口")
@RequestMapping("/v1/robot/rent")
public class ContactController {


    @Autowired
    private ContractApplication contractApplication;

    @ApiOperation(value = "出租合约保存更新", notes = "出租合约保存更新")
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Map<String, Object>> saveRentContract(@RequestBody RentContractDto saveOrUpdate) {
        try {
            contractApplication.saveOrUpdateContractRent(saveOrUpdate);
            return WebUtil.result(null);
        } catch (Exception e) {
            e.printStackTrace();
            log.error(MessageFormat.format("saveRentContract Failed :{0}", e));
            return WebUtil.error("出租合约保存失败");
        }
    }

    @ApiOperation(value = "获取出租合约", notes = "获取出租合约")
    @RequestMapping(value = "/get", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Map<String, Object>> getRentContract(@RequestBody CommonQueryCondDto cond) {
        try {
            RentContractDto result = contractApplication.queryRentInfoByRobotUnionCode(cond.getUnionCode());
            return WebUtil.result(result);
        } catch (Exception e) {
            e.printStackTrace();
            log.error(MessageFormat.format("getRentContract Failed :{0}", e));
            return WebUtil.error("获取出租合约失败");
        }
    }

}
