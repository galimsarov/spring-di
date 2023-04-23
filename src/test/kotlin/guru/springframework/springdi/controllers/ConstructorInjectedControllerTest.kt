package guru.springframework.springdi.controllers

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class ConstructorInjectedControllerTest {
    @Autowired
    private lateinit var controller: ConstructorInjectedController

    @Test
    fun sayHello() {
        println(controller.sayHello())
    }
}