package com.jerome.springlession;

import com.jerome.springlession.dto.BlogProperties;
import com.jerome.springlession.dto.TestConfigBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


/**
 * @author liushengjie
 */
@SpringBootApplication
@EnableConfigurationProperties({BlogProperties.class, TestConfigBean.class})
public class SpringlifeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringlifeApplication.class, args);
    }


}
