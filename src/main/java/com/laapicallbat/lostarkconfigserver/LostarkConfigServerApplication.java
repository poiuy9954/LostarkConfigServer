package com.laapicallbat.lostarkconfigserver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@Slf4j
@SpringBootApplication
@EnableConfigServer
public class LostarkConfigServerApplication {

    public static void main(String[] args) {
        log.info("=== Lostark Config Server Starting ===");
        SpringApplication.run(LostarkConfigServerApplication.class, args);
        log.info("=== Lostark Config Server Started Successfully ===");
    }

}
