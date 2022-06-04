package com.api.gateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class FallbackController {
	
	@RequestMapping("/orderFallback")
	public Mono<String> oderServiceFallback(){
		
		return Mono.just("Order Service is taking too long time to respond.");
	}
	
	@RequestMapping("/paymentFallback")
	public Mono<String> paymentServiceFallback(){
		
		return Mono.just("Payment Service is taking too long time to respond.");
	}

}
