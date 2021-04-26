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
                .route(r -> r.path("/artists/**")
                        .uri("lb://RECORD-SHOP-CATALOG"))
                .route(r -> r.path("/genres/**")
                        .uri("lb://RECORD-SHOP-CATALOG"))
                .route(r -> r.path("/orders/**")
                    .uri("lb://RECORD-SHOP-CART"))
                .route(r -> r.path("/users/**")
                    .uri("lb://RECORD-SHOP-AUTH"))
                .route(r -> r.path("/oauth2/**")
                    .uri("lb://RECORD-SHOP-AUTH"))
                .build();
    }
}
