package com.serveurdeconfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ServeurdeconfigurationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServeurdeconfigurationApplication.class, args);
	}

}
