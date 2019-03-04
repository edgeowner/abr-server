package com.atmatrix.abr.controller;

import com.atmatrix.abr.application.RobotApplication;
import com.atmatrix.abr.application.dto.ExceRobotDto;
import com.atmatrix.abr.application.dto.ExceRobotInfoDto;
import com.atmatrix.abr.application.dto.condtion.QueryCondExceDto;
import com.atmatrix.abr.application.dto.condtion.QueryCondPageDto;
import com.atmatrix.abr.application.dto.page.PageInfoResult;
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
 * @ClassName: CommonController
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-03-04 4:04 PM
 **/

@Slf4j
@RestController
@Api(tags = "CommonController", description = "通用异常调整")
@RequestMapping("/v1/robot/exce")
public class CommonController {

    @Autowired
    private RobotApplication robotApplication;


    @ApiOperation(value = "异常机器列表获取", notes = "异常机器列表获取")
    @RequestMapping(value = "/list/get", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Map<String, Object>> getSimpleExceRobot(@RequestBody QueryCondPageDto cond) {
        try {
            PageInfoResult<ExceRobotDto> result = robotApplication.getExceRobotList(cond);
            return WebUtil.result(result);
        } catch (Exception e) {
            e.printStackTrace();
            log.error(MessageFormat.format("getBalanceInfo Failed :{0}", e));
            return WebUtil.error("获取所有异常机器分页列表");
        }
    }

    @ApiOperation(value = "异常机器详情获取", notes = "异常机器详情获取")
    @RequestMapping(value = "/info/get", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Map<String, Object>> getExceRobotInfo(@RequestBody QueryCondExceDto cond) {
        try {
            ExceRobotInfoDto result  = robotApplication.getExceRobotInfo(cond);
            return WebUtil.result(result);
        } catch (Exception e) {
            e.printStackTrace();
            log.error(MessageFormat.format("getBalanceInfo Failed :{0}", e));
            return WebUtil.error("获取不同工种绩效水平失败");
        }
    }
}
