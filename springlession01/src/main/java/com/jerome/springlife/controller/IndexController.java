package com.jerome.springlife.controller;

import com.jerome.springlife.dto.BlogProperties;
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

    @RequestMapping("/")
    String index() {
        return blogProperties.getTitle() + "--" + blogProperties.getName();
    }
}
