package com.walkwind.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAsync    //开启异步注解
@EnableScheduling   //开启定时任务注解
@SpringBootApplication
public class BootSenior04TaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootSenior04TaskApplication.class, args);
    }

}
