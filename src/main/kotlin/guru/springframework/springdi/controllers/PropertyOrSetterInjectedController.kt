package guru.springframework.springdi.controllers

import guru.springframework.springdi.services.GreetingService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Controller

@Controller
class PropertyOrSetterInjectedController {
    @Autowired
    @Qualifier("propertyOrSetterGreetingService")
    private lateinit var greetingService: GreetingService

    fun sayHello(): String = greetingService.sayGreeting()
}