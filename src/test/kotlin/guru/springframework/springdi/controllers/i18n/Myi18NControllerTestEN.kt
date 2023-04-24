package guru.springframework.springdi.controllers.i18n

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles

@ActiveProfiles("EN")
@SpringBootTest
class Myi18NControllerTestEN {
    @Autowired
    private lateinit var myi18NController: Myi18NController

    @Test
    fun sayHello() {
        println(myi18NController.sayHello())
    }
}