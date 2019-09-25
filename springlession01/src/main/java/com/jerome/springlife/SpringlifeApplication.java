package com.jerome.springlife;

import com.jerome.springlife.dto.BlogProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;


@SpringBootApplication
@EnableConfigurationProperties({BlogProperties.class})
public class SpringlifeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringlifeApplication.class, args);
	}

}
