package com.dailycodebuffer.hystrix.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

//need hystrix(circuit breaker) dashboard for failure management
//fallback is handled by this, if any ms is down, it will run fallback method
// and let user know about service down
//hystrix dashboard required to say which all services running and which are not
//configuration and fallback controller is written in api gateway and filters in 
//application.yml of api gateway
//hystrix streams also enabled
@SpringBootApplication
@EnableHystrixDashboard
@EnableEurekaClient
public class HystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixDashboardApplication.class, args);
	}

}
