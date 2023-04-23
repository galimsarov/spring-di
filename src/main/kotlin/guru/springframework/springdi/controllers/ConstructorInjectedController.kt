package guru.springframework.springdi.controllers

import guru.springframework.springdi.services.GreetingService
import org.springframework.stereotype.Controller

@Controller
class ConstructorInjectedController(private val greetingService: GreetingService) {
    fun sayHello(): String = greetingService.sayGreeting()
}