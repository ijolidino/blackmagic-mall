package com.blackmagic.mall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.blackmagic.mall.member.feign")
public class BlackamgicMenberApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlackamgicMenberApplication.class, args);
	}

}
