package guru.springframework.springdi.controllers

import guru.springframework.springdi.services.GreetingServiceImpl
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class PropertyOrSetterInjectedControllerTest {
    private lateinit var propertyOrSetterInjectedController: PropertyOrSetterInjectedController

    @BeforeEach
    fun setUp() {
        propertyOrSetterInjectedController = PropertyOrSetterInjectedController()
        propertyOrSetterInjectedController.greetingService = GreetingServiceImpl()
    }

    @Test
    fun sayHello() {
        println(propertyOrSetterInjectedController.sayHello())
    }
}