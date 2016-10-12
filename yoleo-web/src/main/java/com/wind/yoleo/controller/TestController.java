package com.wind.yoleo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;
import com.wind.yoleo.common.model.User;
import com.wind.yoleo.service.TestService;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/test")
public class TestController {

    private final static Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public ResponseEntity<String> user(HttpServletRequest request, HttpServletResponse response) throws Exception {
        User user = testService.hello();
        LOGGER.info("user:{}", user);
        return new ResponseEntity<String>(JSON.toJSONString(user), HttpStatus.OK);
    }

    @RequestMapping(value = "/userList", method = RequestMethod.GET)
    @ResponseBody
    public String userList(){
        LOGGER.debug("userList begin>>>>>>");
        return JSON.toJSONString(testService.selectAll());
    }
}
