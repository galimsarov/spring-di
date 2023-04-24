package guru.springframework.springdi.controllers.i18n

import guru.springframework.springdi.services.GreetingService
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Controller

@Controller
class Myi18NController(
    @Qualifier("i18NService")
    private val greetingService: GreetingService
) {
    fun sayHello(): String = greetingService.sayGreeting()
}