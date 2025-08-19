package com.example.boot_demo.controller;

public class HelloUtil {
    public static String sayHello() {
        String hello = StaticConfigReference.getAppConfig().getHello();
        return hello + ", World!";
    }
}
