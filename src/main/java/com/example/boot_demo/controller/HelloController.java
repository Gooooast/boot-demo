package com.example.boot_demo.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

    @RequestMapping(value = "/file", method = RequestMethod.POST)
    public void testFile(@RequestParam("file") MultipartFile multipartFile) {
        System.out.println(multipartFile.getOriginalFilename());
        System.out.println(multipartFile.getName());
    }
}
