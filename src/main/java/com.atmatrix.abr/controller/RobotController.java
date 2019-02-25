package com.atmatrix.abr.controller;

import com.atmatrix.abr.application.RobotApplication;
import com.atmatrix.abr.application.dto.condtion.QueryCondPageDicDto;
import com.atmatrix.abr.application.dto.page.PageInfoResult;
import com.atmatrix.abr.common.web.WebUtil;
import com.atmatrix.abr.mgt.dto.RobotDetailDto;
import com.atmatrix.abr.mgt.dto.RobotDetailExtendDto;
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
 * @ClassName: RobotController
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-02-22 8:05 AM
 **/

@Slf4j
@RestController
@Api(tags = "RobotController", description = "机器人数据")
@RequestMapping("/v1/robot/info")
public class RobotController {


    @Autowired
    private RobotApplication robotApplication;

    @ApiOperation(value = "获取机器人列表", notes = "获取机器人列表")
    @RequestMapping(value = "/list/get", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Map<String, Object>> getRobotList(@RequestBody QueryCondPageDicDto cond) {
        try {
            PageInfoResult<RobotDetailDto> pageRobotList = robotApplication.getRobotDetailPageList(cond);
            return WebUtil.result(pageRobotList);
        } catch (Exception e) {
            e.printStackTrace();
            log.error(MessageFormat.format("getRegionList Failed :{0}", e));
            return WebUtil.error("查询Region失败");
        }
    }


    @ApiOperation(value = "获取机器人数据详情", notes = "获取机器人数据详情")
    @RequestMapping(value = "/detail/get", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Map<String, Object>> getRobotDetailInfo(@RequestBody CommonQueryCondDto cond) {
        try {
            String unionCode = cond.getUnionCode();
            RobotDetailExtendDto result = robotApplication.getRobotDetailExntendInfo(unionCode);
            return WebUtil.result(result);
        } catch (Exception e) {
            e.printStackTrace();
            log.error(MessageFormat.format("getRegionList Failed :{0}", e));
            return WebUtil.error("查询Region失败");
        }
    }

}
