package com.atmatrix.abr.controller;

import com.atmatrix.abr.application.ContractApplication;
import com.atmatrix.abr.application.dto.condtion.QueryCondPageDicDto;
import com.atmatrix.abr.application.dto.page.PageInfoResult;
import com.atmatrix.abr.application.dto.rent.RentContractDto;
import com.atmatrix.abr.common.web.WebUtil;
import com.atmatrix.abr.mgt.dto.RobotDetailDto;
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
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-02-27 8:31 PM
 **/

@Slf4j
@RestController
@Api(tags = "ContactController", description = "机器人合约接口")
@RequestMapping("/v1/robot/trade")
public class ContactController {


    @Autowired
    private ContractApplication contractApplication;

    @ApiOperation(value = "机器人出租合约保存", notes = "机器人出租合约保存")
    @RequestMapping(value = "/rent/save", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Map<String, Object>> getRobotList(@RequestBody RentContractDto saveOrUpdate) {
        try {
            contractApplication.saveOrUpdateContractRent(saveOrUpdate);
            return WebUtil.result(null);
        } catch (Exception e) {
            e.printStackTrace();
            log.error(MessageFormat.format("getRobotList Failed :{0}", e));
            return WebUtil.error("查询机器人列表失败");
        }
    }

    @ApiOperation(value = "获取机器人出租合约", notes = "获取机器人出租合约")
    @RequestMapping(value = "/rent/get", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Map<String, Object>> getRentDetail(@RequestBody CommonQueryCondDto cond) {
        try {
            RentContractDto result = contractApplication.queryRentInfoByRobotUnionCode(cond.getUnionCode());
            return WebUtil.result(result);
        } catch (Exception e) {
            e.printStackTrace();
            log.error(MessageFormat.format("getRentDetail Failed :{0}", e));
            return WebUtil.error("获取机器人出租合约失败");
        }
    }

}
