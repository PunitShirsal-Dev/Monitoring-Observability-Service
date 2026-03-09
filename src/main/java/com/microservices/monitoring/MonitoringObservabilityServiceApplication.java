package com.microservices.monitoring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MonitoringObservabilityServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MonitoringObservabilityServiceApplication.class, args);
    }
}

