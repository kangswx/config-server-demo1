package com.swkang.springcloud.configserverdemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerDemo1Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerDemo1Application.class, args);
    }

}
