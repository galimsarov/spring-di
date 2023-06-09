package guru.springframework.springdi.controllers

import guru.springframework.springdi.services.GreetingService
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Controller

@Controller
class ConstructorInjectedController(
    @Qualifier("greetingServiceImpl")
    private val greetingService: GreetingService
) {
    fun sayHello(): String = greetingService.sayGreeting()
}