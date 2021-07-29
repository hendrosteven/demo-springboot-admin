package com.brainmatics.demospringbootadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableAdminServer
@SpringBootApplication
public class DemoSpringbootAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringbootAdminApplication.class, args);
	}

}
