package com.magicode.jenkins;

import javax.annotation.PostConstruct;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsDemoApplication {

	public static org.slf4j.Logger logger=LoggerFactory.getLogger(JenkinsDemoApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("Application started...");
	}
	public static void main(String[] args) {
	    logger.info("Application executed...");
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}

}
