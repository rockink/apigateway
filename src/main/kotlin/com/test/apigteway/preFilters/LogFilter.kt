package com.test.apigteway.preFilters

import com.fasterxml.jackson.databind.ObjectMapper
import com.netflix.zuul.ZuulFilter
import com.netflix.zuul.context.RequestContext
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component


@Component
class LogFilter(val objectMapper: ObjectMapper): ZuulFilter() {

    val logger = LoggerFactory.getLogger(LogFilter::class.java);

    override fun run(): Any? {
        val url = getURLAndParams();
        logger.info("URL recieved: $url")
        return null;
    }


    fun getURLAndParams(): Any {
        val currentRequest = RequestContext.getCurrentContext().request;

        val url = currentRequest.requestURL;
        val params = objectMapper.writeValueAsString(currentRequest.parameterMap)
        return "url= $url, params=$params";
    }

    override fun shouldFilter() = true

    override fun filterType() = "pre"

    /**
     * Filter closer towards first
     */
    override fun filterOrder() = 1

}