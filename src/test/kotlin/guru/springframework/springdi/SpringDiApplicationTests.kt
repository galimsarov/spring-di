package guru.springframework.springdi

import guru.springframework.springdi.controllers.MyController
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext

@SpringBootTest
class SpringDiApplicationTests {
    @Autowired
    private lateinit var applicationContext: ApplicationContext

    @Autowired
    private lateinit var myController: MyController

    @Test
    fun testAutowiredOfController() {
        println(myController.sayHello())
    }

    @Test
    fun getControllerFromCtx() {
        val myController: MyController = applicationContext.getBean(MyController::class.java)
        println(myController.sayHello())
    }

    @Test
    fun contextLoads() {
    }

}
