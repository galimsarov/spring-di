package guru.springframework.springdi.services.i18n

import guru.springframework.springdi.services.GreetingService
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

@Profile("ES")
@Service("i18NService")
@Suppress("unused")
class SpanishGreetingService : GreetingService {
    override fun sayGreeting(): String = "Hola Mundo - ES"
}