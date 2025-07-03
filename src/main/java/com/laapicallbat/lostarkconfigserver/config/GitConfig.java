package com.laapicallbat.lostarkconfigserver.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ToString
@Setter
@Getter
@Component
@ConfigurationProperties(prefix = "spring.cloud.config.server.git")
public class GitConfig {
    private String uri;
    private String username;
    private String password;
}
