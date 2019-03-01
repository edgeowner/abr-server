package com.atmatrix.abr.controller;

import com.atmatrix.abr.application.DictionaryAppliction;
import com.atmatrix.abr.application.dto.BillingDto;
import com.atmatrix.abr.application.dto.DictionaryDto;
import com.atmatrix.abr.common.web.WebUtil;
import com.atmatrix.abr.mgt.dto.RobotWorkTypeDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.MessageFormat;
import java.util.List;
import java.util.Map;

/**
 * @ProjectName: abr-server
 * @ClassName: DictionaryController
 * @Description:
 * @Author: edgeowner
 * @Create: 2019-02-20 7:19 PM
 **/


@Slf4j
@RestController
@Api(tags = "DictionaryController", description = "机器人常用数据字典")
@RequestMapping("/v1/dic/info")
public class DictionaryController {

    @Autowired
    private DictionaryAppliction dictionaryAppliction;

    @ApiOperation(value = "获取行政区字典", notes = "获取行政区字典")
    @RequestMapping(value = "/region/get", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Map<String, Object>> getRegionList() {
        try {
            List<DictionaryDto> regionList = dictionaryAppliction.queryRegionList();
            return WebUtil.result(regionList);
        } catch (Exception e) {
            e.printStackTrace();
            log.error(MessageFormat.format("getRegionList Failed :{0}", e));
            return WebUtil.error("查询Region失败");
        }
    }

    @ApiOperation(value = "获取机器工种字典", notes = "获取机器工种字典")
    @RequestMapping(value = "/workType/get", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Map<String, Object>> getWorkTypeList() {
        try {
            List<RobotWorkTypeDto> regionList = dictionaryAppliction.queryWorkTypeList();
            return WebUtil.result(regionList);
        } catch (Exception e) {
            e.printStackTrace();
            log.error(MessageFormat.format("getWorkTypeList Failed :{0}", e));
            return WebUtil.error("查询机器工种失败");
        }
    }


    @ApiOperation(value = "获取计费模式及价格字典", notes = "获取计费模式及价格字典")
    @RequestMapping(value = "/billing/get", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Map<String, Object>> getBillingList() {
        try {
            List<BillingDto> regionList = dictionaryAppliction.queryBillingList();
            return WebUtil.result(regionList);
        } catch (Exception e) {
            e.printStackTrace();
            log.error(MessageFormat.format("getBillingList Failed :{0}", e));
            return WebUtil.error("获取计费模式及价格失败");
        }
    }

    @ApiOperation(value = "获取出租状态字典", notes = "获取出租状态字典")
    @RequestMapping(value = "/status/get", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Map<String, Object>> getRentStatusList() {
        try {
            List<DictionaryDto> regionList = dictionaryAppliction.queryRentStatusList();
            return WebUtil.result(regionList);
        } catch (Exception e) {
            e.printStackTrace();
            log.error(MessageFormat.format("getRentStatusList Failed :{0}", e));
            return WebUtil.error("获取出租状态失败");
        }
    }


}
