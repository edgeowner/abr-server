package com.atmatrix.abr.controller;

import com.atmatrix.abr.application.OverdraftApplication;
import com.atmatrix.abr.application.PriceApplication;
import com.atmatrix.abr.application.dto.BillingOverdraftDto;
import com.atmatrix.abr.application.dto.condtion.QueryCondPageDto;
import com.atmatrix.abr.application.dto.condtion.WorkTypeCondDto;
import com.atmatrix.abr.application.dto.page.PageInfoResult;
import com.atmatrix.abr.common.web.WebUtil;
import com.atmatrix.abr.mgt.dto.OverdraftDto;
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
 * @ClassName: OverdraftController
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-03-04 2:05 PM
 **/

@Slf4j
@RestController
@Api(tags = "OverdraftController", description = "透支调整接口")
@RequestMapping("/v1/robot/overdraft")
public class OverdraftController {
    @Autowired
    private OverdraftApplication overdraftApplication;

    @ApiOperation(value = "获取透支调整机器列表", notes = "获取透支调整机器列表")
    @RequestMapping(value = "/list/get", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Map<String, Object>> getBalanceInfo(@RequestBody QueryCondPageDto cond) {
        try {
            PageInfoResult<OverdraftDto> result = overdraftApplication.getRobotBalanceInfo(cond);
            return WebUtil.result(result);
        } catch (Exception e) {
            e.printStackTrace();
            log.error(MessageFormat.format("getBalanceInfo Failed :{0}", e));
            return WebUtil.error("获取不同工种绩效水平失败");
        }
    }

//    @ApiOperation(value = "调整机器透支", notes = "获取异常机器列表")
//    @RequestMapping(value = "/overdraft/adjust", method = RequestMethod.POST)
//    @ResponseBody
//    public ResponseEntity<Map<String, Object>> adjustOverdraft(@RequestBody WorkTypeCondDto cond) {
//        try {
//            overdraftApplication.adjustBillingPrice(cond);
//            return WebUtil.success();
//        } catch (Exception e) {
//            e.printStackTrace();
//            log.error(MessageFormat.format("adjustOverdraft Failed :{0}", e));
//            return WebUtil.error("调整机器透支失败");
//        }
//    }



}
