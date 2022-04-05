package com.example

import io.micronaut.runtime.Micronaut
import groovy.transform.CompileStatic
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker

@CompileStatic
@EnableCircuitBreaker
class Application {
    static void main(String[] args) {
        Micronaut.run(Application, args)
    }
}
