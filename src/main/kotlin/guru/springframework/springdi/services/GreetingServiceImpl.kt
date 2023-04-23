package guru.springframework.springdi.services

import org.springframework.stereotype.Service

@Service
class GreetingServiceImpl : GreetingService {
    override fun sayGreeting(): String = "Hello Everyone from Base Service!!!"
}