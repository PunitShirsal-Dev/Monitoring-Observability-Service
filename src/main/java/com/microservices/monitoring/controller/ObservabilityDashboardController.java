package com.microservices.monitoring.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/observability")
public class ObservabilityDashboardController {

    @GetMapping("/dashboard")
    public ResponseEntity<Map<String, Object>> dashboard() {
        Map<String, Object> links = new LinkedHashMap<>();
        links.put("service", "Monitoring-Observability-Service");
        links.put("actuator", "/actuator");
        links.put("health", "/actuator/health");
        links.put("liveness", "/actuator/health/liveness");
        links.put("readiness", "/actuator/health/readiness");
        links.put("prometheus", "/actuator/prometheus");
        links.put("grafana", "http://localhost:3000");
        links.put("kibana", "http://localhost:5601");
        links.put("zipkin", "http://localhost:9411");
        links.put("jaeger", "http://localhost:16686");
        return ResponseEntity.ok(links);
    }
}

