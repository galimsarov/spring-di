package guru.springframework.springdi.controllers

import org.springframework.stereotype.Controller

@Controller
class MyController {
    fun sayHello(): String {
        println("I'm in the controller")
        return "Hello Everyone!!!"
    }
}