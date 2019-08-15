package com.hpt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: idea_run
 * @description: springboot启动类
 * @author: xh
 * @create: 2019-08-15 15:57
 */
@MapperScan("com.hpt.mapper") //扫描的mapper
@SpringBootApplication
public class HelpInTimeApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelpInTimeApplication.class, args);
    }

}