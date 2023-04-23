package guru.springframework.springdi.controllers

import guru.springframework.springdi.services.GreetingService

class ConstructorInjectedController(private val greetingService: GreetingService) {
    fun sayHello(): String = greetingService.sayGreeting()
}