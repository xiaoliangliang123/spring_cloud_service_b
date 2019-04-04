package com.serviceb.serviceb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class ServicebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicebApplication.class, args);
    }

}
