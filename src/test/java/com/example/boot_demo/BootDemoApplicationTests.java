package com.example.boot_demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.nio.file.Path;
import java.nio.file.Paths;

@SpringBootTest
class BootDemoApplicationTests {

	@Test
	void contextLoads() {
		Path test = Paths.get("/root", "test").toAbsolutePath().normalize();
		System.out.println(test);
	}

}
