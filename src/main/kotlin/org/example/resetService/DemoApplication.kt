package org.example.resetService

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.web.servlet.view.json.MappingJackson2JsonView

@SpringBootApplication
class DemoApplication{
    @Bean
    open fun json(): MappingJackson2JsonView {
        return MappingJackson2JsonView(ObjectMapper())
    }
}

fun main(args:Array<String>){
    runApplication<DemoApplication>(*args)
}