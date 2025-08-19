package com.example.boot_demo.controller;

import com.example.boot_demo.domain.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/hello")
    public String hello(HttpServletRequest request, HttpServletResponse response,
                        @RequestParam String name, @RequestParam int age) {
        String inName = request.getParameter("name");
        String inAge = request.getParameter("age");

        System.out.println("Name: " + name + ", Age: " + age + ", InName: " + inName + ", InAge: " + inAge);

        System.out.println(StaticConfigReference.getAppConfig().getHello());
        System.out.println(HelloUtil.sayHello());

        return "Hello World!";
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public void addUser(String name, int age, String hometown) {
        User user = new User();
        user.setUsername(name);
        user.setAge(age);
        user.setHometown(hometown);

        System.out.println(user);
    }

}
