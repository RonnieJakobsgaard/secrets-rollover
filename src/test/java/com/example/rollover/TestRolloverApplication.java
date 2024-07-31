package com.example.rollover;

import org.springframework.boot.SpringApplication;

public class TestRolloverApplication {

	public static void main(String[] args) {
		SpringApplication.from(RolloverApplication::main).with(TestContainersConfiguration.class).run(args);
	}

}
