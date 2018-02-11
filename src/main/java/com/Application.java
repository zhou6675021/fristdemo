package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableCircuitBreaker
@EnableHystrix
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
@EnableAutoConfiguration
public class Application {
    public static  void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
