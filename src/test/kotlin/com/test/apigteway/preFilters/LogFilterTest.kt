package com.test.apigteway.preFilters

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import org.springframework.web.context.WebApplicationContext

/**
 * This actually is not a test, but rather a trigger..
 * We call /test?sth=nth endpoint. and this will then log
 * which is what we can analyze
 */
@RunWith(SpringRunner::class)
@SpringBootTest
class LogFilterTest{

    @Autowired
    lateinit var webApplicationContext: WebApplicationContext

    private lateinit var mockMvc: MockMvc

    @Before
    fun initMockCall(){
        this.mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    fun logTest(){
            mockMvc.perform(get("/test?nth=sth"));
    }

}