package com.jerome.springlession.controller;

import com.jerome.springlession.dto.BlogProperties;
import com.jerome.springlession.dto.TestConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: JeRome
 * @Organization: FinTech-Dev
 * @Date: 2019/9/25 10:45
 * @Description:
 */
@RestController
public class IndexController {
    @Autowired
    BlogProperties blogProperties;

    @Autowired
    TestConfigBean testConfigBean;

    @RequestMapping("/")
    String index() {
        return blogProperties.getTitle() + "--" + blogProperties.getName();
    }

    @RequestMapping("/index2")
    String index2() {
        return testConfigBean.getName() + "--" + testConfigBean.getAge();
    }
}
