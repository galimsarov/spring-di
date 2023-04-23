package guru.springframework.springdi.controllers

import guru.springframework.springdi.services.GreetingService

class PropertyOrSetterInjectedController {
    lateinit var greetingService: GreetingService

    fun sayHello(): String = greetingService.sayGreeting()
}