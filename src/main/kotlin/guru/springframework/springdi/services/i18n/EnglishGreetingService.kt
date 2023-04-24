package guru.springframework.springdi.services.i18n

import guru.springframework.springdi.services.GreetingService
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

@Profile("EN", "default")
//@Profile(value = ["EN", "default"])
@Service("i18NService")
@Suppress("unused")
class EnglishGreetingService : GreetingService {
    override fun sayGreeting(): String = "Hello World - EN"
}