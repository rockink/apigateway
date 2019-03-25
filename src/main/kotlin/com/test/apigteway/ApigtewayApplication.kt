package com.test.apigteway

import com.test.apigteway.preFilters.LogFilter
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.zuul.EnableZuulProxy
import org.springframework.context.annotation.Bean

@SpringBootApplication
@EnableZuulProxy
class ApigtewayApplication

fun main(args: Array<String>) {
    runApplication<ApigtewayApplication>(*args)
}
