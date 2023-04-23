package guru.springframework.springdi.controllers

import guru.springframework.springdi.services.GreetingServiceImpl
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class ConstructorInjectedControllerTest {
    private lateinit var controller: ConstructorInjectedController

    @BeforeEach
    fun setUp() {
        controller = ConstructorInjectedController(GreetingServiceImpl())
    }

    @Test
    fun sayHello() {
        println(controller.sayHello())
    }
}