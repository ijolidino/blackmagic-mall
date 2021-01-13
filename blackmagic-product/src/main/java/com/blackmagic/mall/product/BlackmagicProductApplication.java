package com.blackmagic.mall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.blackmagic.mall.product.dao")
public class BlackmagicProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlackmagicProductApplication.class, args);
    }

}