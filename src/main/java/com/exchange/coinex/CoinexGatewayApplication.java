package com.exchange.coinex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CoinexGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoinexGatewayApplication.class, args);
    }

}
