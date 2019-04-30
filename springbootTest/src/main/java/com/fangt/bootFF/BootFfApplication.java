package com.fangt.bootFF;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class BootFfApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootFfApplication.class, args);
	}

}
