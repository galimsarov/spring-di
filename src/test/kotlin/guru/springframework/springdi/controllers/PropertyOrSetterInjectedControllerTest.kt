package guru.springframework.springdi.controllers

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class PropertyOrSetterInjectedControllerTest {
    @Autowired
    private lateinit var propertyOrSetterInjectedController: PropertyOrSetterInjectedController

    @Test
    fun sayHello() {
        println(propertyOrSetterInjectedController.sayHello())
    }
}