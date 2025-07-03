package com.laapicallbat.lostarkconfigserver.config;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class asdSErvice {
    private final GitConfig gitConfig;

    public asdSErvice(GitConfig gitConfig) {
        this.gitConfig = gitConfig;
        System.out.println("Git " + gitConfig.toString());
    }
}
