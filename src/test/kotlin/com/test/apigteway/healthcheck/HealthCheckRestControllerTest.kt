package com.test.apigteway.healthcheck

import org.junit.Assert.*
import org.junit.BeforeClass
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class HealthCheckRestControllerTest{

    @Autowired
    lateinit var healthCheckController: HealthCheckController;

    @Test
    fun testHealthCheck(){
        val upStatus = "UP";
        val healthStatus = healthCheckController.getStatus();
        assertEquals(healthStatus.status, upStatus);
    }

}