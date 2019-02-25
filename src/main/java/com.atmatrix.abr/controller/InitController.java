package com.atmatrix.abr.controller;

import com.atmatrix.abr.application.InitDataAppliction;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.MessageFormat;

/**
 * @ProjectName: wx-msg-persistence
 * @ClassName: HomeController
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-01-14 3:40 PM
 **/

@Slf4j
@RestController
public class InitController {


    @Autowired
    private InitDataAppliction initDataAppliction;

    @ApiOperation("Hello接口")
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String home() {
        return "Hello World!";
    }

}
