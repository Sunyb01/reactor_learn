package com.sunyb.reactor.flux;

import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;

/**
 * @author yb.Sun
 * @date 2024/4/2 10:45
 */
public class SimpleCreate {

    public void buildFromJust() {
        Flux<String> seq = Flux.just("foo", "bar", "foobar");
    }

    public void buildFromIterable() {
        List<String> iterable = Arrays.asList("foo", "bar", "foobar");
        Flux<String> seq = Flux.fromIterable(iterable);
    }

    public void buildFromRange() {
        Flux<Integer> seq = Flux.range(5, 3);
    }

}
