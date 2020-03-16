package com.exchange.coinex.intercepter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.core.Ordered;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * <功能描述> <br>
 *
 * @className: AuthIntercepter
 * @package: com.exchange.coinex.intercepter
 * @author: kunlun
 * @date: 2020/3/16 12:29 下午
 */
public class AuthIntercepter implements GatewayFilter, Ordered {

    private static final Logger LOG = LoggerFactory.getLogger(AuthIntercepter.class);

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        LOG.info("进入网关...");
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
