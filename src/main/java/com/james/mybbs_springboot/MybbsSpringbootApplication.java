package com.james.mybbs_springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@MapperScan("com.james.mybbs_springboot.mapper")
public class MybbsSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybbsSpringbootApplication.class, args);
    }

}
