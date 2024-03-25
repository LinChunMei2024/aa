package com.example.demo;

import com.example.demo.maper.teacherMapper;
import com.example.demo.maper.userMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Scanner;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	private teacherMapper aa;

	@Test
	void contextLoads() {
		System.out.println("");
	}

}
