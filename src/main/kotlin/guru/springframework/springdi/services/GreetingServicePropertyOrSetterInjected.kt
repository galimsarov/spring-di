package guru.springframework.springdi.services

import org.springframework.stereotype.Service

@Service("propertyOrSetterGreetingService")
@Suppress("unused")
class GreetingServicePropertyOrSetterInjected : GreetingService {
    override fun sayGreeting(): String = "Friends don't let friends to property injection!!!"
}