package com.mercadolibre.mutant.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class GatewayServerMutantApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(GatewayServerMutantApplication.class, args);
	}
}
