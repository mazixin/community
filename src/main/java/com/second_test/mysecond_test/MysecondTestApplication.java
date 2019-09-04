package com.second_test.mysecond_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MysecondTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MysecondTestApplication.class, args);
    }

}
