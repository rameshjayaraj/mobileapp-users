package com.mobileapp.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EntityScan(basePackages = {"com.mobileapp.users.data"})  // scan JPA entities
public class MobileappUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobileappUsersApplication.class, args);
	}

}
