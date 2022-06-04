package com.api.gateway.routeconfig;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class RouterConfig {
	
	@Bean
	public RouteLocator customAppRouteLocator(RouteLocatorBuilder builder) {
		
		return builder.routes()
				.route("order-service",r->r.path("/api/order/**")
						.uri("lb://ORDER-SERVICE"))
				.route("payment-service",i->i.path("/api/payment/**")
						.uri("lb://PAYMENT-SERVICE"))
				.build();
	}


}
