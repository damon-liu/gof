package com.damon.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 设计模式练习
 */
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class GofApplication {

    public static void main(String[] args) {
        SpringApplication.run(GofApplication.class, args);
    }

}
