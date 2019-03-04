package com.atmatrix.abr.controller;

import com.atmatrix.abr.application.PriceApplication;
import com.atmatrix.abr.application.dto.PriceStandardDto;
import com.atmatrix.abr.application.dto.condtion.QueryCondPageDto;
import com.atmatrix.abr.application.dto.condtion.WorkTypeCondDto;
import com.atmatrix.abr.application.dto.page.PageInfoResult;
import com.atmatrix.abr.common.web.WebUtil;
import com.atmatrix.abr.mgt.dto.RobotPriceExceDto;
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
 * @ClassName: EvalutionController
 * @Description:
 * @Author: edgeowner
 * @Create: 2019-02-28 7:52 PM
 **/

@Slf4j
@RestController
@Api(tags = "PriceController", description = "定价调整接口")
@RequestMapping("/v1/robot/price")
public class PriceController {

    @Autowired
    private PriceApplication priceApplication;

    @ApiOperation(value = "获取不同工种收入水平", notes = "获取不同工种收入水平")
    @RequestMapping(value = "/list/get", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Map<String, Object>> getStandardInfo(@RequestBody QueryCondPageDto cond) {
        try {
            PageInfoResult<PriceStandardDto> result = priceApplication.getStandardGroupByWorkType(cond);
            return WebUtil.result(result);
        } catch (Exception e) {
            e.printStackTrace();
            log.error(MessageFormat.format("getStandardInfo Failed :{0}", e));
            return WebUtil.error("获取不同工种水平失败");
        }
    }

    @ApiOperation(value = "获取价格异常机器列表", notes = "获取异常机器列表")
    @RequestMapping(value = "/exce/get", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Map<String, Object>> getExceptionRobotList(@RequestBody WorkTypeCondDto cond) {
        try {
            PageInfoResult<RobotPriceExceDto> result = priceApplication.getPriceExceRobot(cond);
            return WebUtil.result(result);
        } catch (Exception e) {
            e.printStackTrace();
            log.error(MessageFormat.format("getExceptionRobotList Failed :{0}", e));
            return WebUtil.error("获取异常机器列表失败");
        }
    }


}
