package com.blackmagic.third.party.thirdparty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BlackmagicThirdPartyApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlackmagicThirdPartyApplication.class, args);
	}

}
