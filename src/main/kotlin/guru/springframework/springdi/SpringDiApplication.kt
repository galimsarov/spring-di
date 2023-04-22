package guru.springframework.springdi

import guru.springframework.springdi.controllers.MyController
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.ApplicationContext

@SpringBootApplication
class SpringDiApplication

fun main(args: Array<String>) {
	val ctx: ApplicationContext = runApplication<SpringDiApplication>(*args)

	val myController: MyController = ctx.getBean("myController") as MyController

	println("I'm in Main Method")

	println(myController.sayHello())
}
