package com.magicode.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsDemoApplicationTests {

	public static org.slf4j.Logger logger=LoggerFactory.getLogger(JenkinsDemoApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("Test case executing ...");
		assertEquals(true, true);
	}

}
