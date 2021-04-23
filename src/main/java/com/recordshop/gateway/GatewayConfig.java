package com.recordshop.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/records/**")
                    .uri("lb://RECORD-SHOP-CATALOG"))
                .route(r -> r.path("/cart/**")
                    .uri("lb://RECORD-SHOP-CART"))
                .build();
    }
}
