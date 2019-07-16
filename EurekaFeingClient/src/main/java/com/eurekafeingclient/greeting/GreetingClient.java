package com.eurekafeingclient.greeting;

import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("spring-cloud-eureka-client")
public interface GreetingClient {
	@RequestMapping("/greeting")
	String greeting();
}
