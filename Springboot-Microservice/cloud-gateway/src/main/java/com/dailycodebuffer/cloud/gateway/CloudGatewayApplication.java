package com.dailycodebuffer.cloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

//Api gateway required to route all requests from user to microservices
//thorugh one port and to available service on service resgistry
//with load balance and pattern match from url which matches with 
//requestmapping in restcontroller
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class CloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudGatewayApplication.class, args);
	}

}
