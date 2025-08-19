package com.example.boot_demo.domain;

import lombok.Data;

@Data
public class User {
    private String username;
    private String password;
    private Integer age;
    private String hometown;
}
