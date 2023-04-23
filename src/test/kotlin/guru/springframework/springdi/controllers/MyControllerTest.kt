package guru.springframework.springdi.controllers

import org.junit.jupiter.api.Test

class MyControllerTest {

    @Test
    fun sayHello() {
        val myController = MyController()
        println(myController.sayHello())
    }
}