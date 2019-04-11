package com.candidates.dream

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.web.servlet.HandlerAdapter
import org.springframework.web.servlet.HandlerMapping
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping


@SpringBootApplication
//@EnableWebMvc
// We use direct @Import instead of @ComponentScan to speed up cold starts
 @ComponentScan("com.candidates.dream")
//@Import( {CandidateRepository::class.java})
class DreamApplication : SpringBootServletInitializer() {
    /*
     * Create required HandlerMapping, to avoid several default HandlerMapping instances being created
     */
    @Bean
    fun handlerMapping(): HandlerMapping {
        return RequestMappingHandlerMapping()
    }

    /*
     * Create required HandlerAdapter, to avoid several default HandlerAdapter instances being created
     */
    @Bean
    fun handlerAdapter(): HandlerAdapter {
        return RequestMappingHandlerAdapter()
    }
}

fun main(args: Array<String>) {
    runApplication<DreamApplication>(*args)
}
