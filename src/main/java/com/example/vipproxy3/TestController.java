package com.example.vipproxy3;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/*
 @Description
 *@author kang.li
 *@date 2021/1/22 10:11   
 */
@RestController
public class TestController {
    @Resource
    private TestService testService;

    @RequestMapping("/test")
    public void test() {
        testService.test();
        System.out.println(".............ok");
    }
}
