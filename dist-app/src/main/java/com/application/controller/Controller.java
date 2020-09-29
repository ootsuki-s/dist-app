package com.application.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ootsuki_s
 * Web API のコントローラ
 */
@RestController
@RequestMapping("/")
public class Controller {
    private static final Logger LOGGER = LoggerFactory.getLogger( Controller.class );

    @RequestMapping("getSample")
    private String getSample(@RequestParam() String param) {
    	LOGGER.info( param );
        return "受け取ったパラメータ：" + param;
    }
    
    @RequestMapping("getSample/{param}")
    private String getSampleParam(@PathVariable String param) {
        LOGGER.info( param );
        return "受け取ったパラメータ：" + param;
    }

    @RequestMapping(value = "postSample", method = RequestMethod.POST)
    private String postSample(@RequestBody String body) {
        LOGGER.info(body);
        return "受け取ったリクエストボディ：" + body;
    }
}
