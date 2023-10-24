package performance.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
/*
* Enable this class or Enable NonReactiveController.java
* */
@RestController
@RequestMapping("/v1/")
public class ReactiveController {
    private static final Logger log = LoggerFactory.getLogger(ReactiveController.class);
    @GetMapping("/get")
    public Mono<String> getData(){
        log.error("Get data start...Processing "+Thread.currentThread());
        return  Mono.just("Hello world!");
    }
}