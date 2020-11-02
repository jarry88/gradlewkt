package org.example.resetService

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
open class GreetingController (
    private val temple:String="Hello,%s",
    private val counter: AtomicLong =AtomicLong()
){
    @GetMapping("/greeting")
    fun greeting(@RequestParam(value= "name",defaultValue = "world") name:String)=Greeting(counter.incrementAndGet(),String.format(temple,name))
}