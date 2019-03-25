package com.test.apigteway.healthcheck

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthCheckController{

    @GetMapping("/status")
    fun getStatus(): HeathStatus {
        return HeathStatus(HeathStatus.UP);
    }
}