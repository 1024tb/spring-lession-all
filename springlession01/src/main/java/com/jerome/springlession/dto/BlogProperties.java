package com.jerome.springlession.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author: JeRome
 * @Organization: FinTech-Dev
 * @Date: 2019/9/25 10:42
 * @Description:
 */

@ConfigurationProperties(prefix = "mrbird.blog")
public class BlogProperties {

    @Value("${mrbird.blog.name}")
    private String name;

    @Value("${mrbird.blog.title}")
    private String title;

    public String getName() {
        return name;
    }

    public BlogProperties setName(String name) {
        this.name = name;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public BlogProperties setTitle(String title) {
        this.title = title;
        return this;
    }
}
