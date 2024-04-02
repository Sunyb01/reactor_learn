package com.sunyb.reactor.mono;

import reactor.core.publisher.Mono;

/**
 * @author yb.Sun
 * @date 2024/4/2 10:45
 */
public class SimpleCreate {

    public void buildFromEmpty() {
        Mono<String> noData = Mono.empty();
    }

    public void buildFromJust() {
        Mono<String> noData = Mono.just("foo");
    }
}
