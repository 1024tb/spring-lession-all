package com.jerome.springlession.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Author: JeRome
 * @Organization: FinTech-Dev
 * @Date: 2019/9/25 10:56
 * @Description:
 */
@Configuration
@Component
@PropertySource("classpath:test.properties")
@ConfigurationProperties(prefix = "test")
public class TestConfigBean {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public TestConfigBean setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public TestConfigBean setAge(int age) {
        this.age = age;
        return this;
    }
}
