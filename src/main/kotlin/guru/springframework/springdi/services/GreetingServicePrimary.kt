package guru.springframework.springdi.services

import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Service

@Primary
@Service
@Suppress("unused")
class GreetingServicePrimary : GreetingService {
    override fun sayGreeting(): String = "Hello From the Primary Bean!!!"
}