package com.example.rollover;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestContainersConfiguration.class)
@SpringBootTest
class RolloverApplicationTests {

	@Test
	void contextLoads() {
	}

}
