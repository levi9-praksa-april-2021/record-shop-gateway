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
                    .uri("http://record-shop-catalog:8100"))
                .route(r -> r.path("/artists/**")
                        .uri("http://record-shop-catalog:8100"))
                .route(r -> r.path("/genres/**")
                        .uri("http://record-shop-catalog:8100"))
                .route(r -> r.path("/orders/**")
                    .uri("http://record-shop-cart:8090"))
                .route(r -> r.path("/users/**")
                    .uri("http://record-shop-auth:9000"))
                .route(r -> r.path("/oauth2/**")
                    .uri("http://record-shop-auth:9000"))
                .route(r -> r.path("/login")
                    .uri("http://record-shop-auth:9000"))
                .build();
    }
}
