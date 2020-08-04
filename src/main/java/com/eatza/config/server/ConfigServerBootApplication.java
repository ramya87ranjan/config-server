package com.eatza.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerBootApplication {


	public static void main(String[] args) {
		SpringApplication.run(ConfigServerBootApplication.class, args);
	}
}
