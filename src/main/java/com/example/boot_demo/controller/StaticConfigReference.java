package com.example.boot_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StaticConfigReference {
    private static AppConfig appConfig;

    @Autowired
    public void setAppConfig(AppConfig appConfig) {
        StaticConfigReference.appConfig = appConfig;
    }

    public static AppConfig getAppConfig() {
        return StaticConfigReference.appConfig;
    }
}
