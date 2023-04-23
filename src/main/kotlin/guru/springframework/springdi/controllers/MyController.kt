package guru.springframework.springdi.controllers

import guru.springframework.springdi.services.GreetingService
import guru.springframework.springdi.services.GreetingServiceImpl
import org.springframework.stereotype.Controller

@Controller
class MyController {
    private val greetingService: GreetingService

    init {
        greetingService = GreetingServiceImpl()
    }

    fun sayHello(): String {
        println("I'm in the controller")
        return greetingService.sayGreeting()
    }
}