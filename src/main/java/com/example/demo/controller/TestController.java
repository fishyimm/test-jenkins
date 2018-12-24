package com.example.demo.controller;

import com.example.demo.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        log.debug("deeja");
        return testService.getTest();
    }
}
