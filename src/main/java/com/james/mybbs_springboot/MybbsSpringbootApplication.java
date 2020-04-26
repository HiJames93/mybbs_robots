package com.james.mybbs_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class MybbsSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybbsSpringbootApplication.class, args);
    }

}
