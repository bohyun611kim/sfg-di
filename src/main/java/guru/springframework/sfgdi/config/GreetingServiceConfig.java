package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.service.ConstructorGreetingService;
import guru.springframework.sfgdi.service.PropertyInjectedGreetingService;
import guru.springframework.sfgdi.service.SetterGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by kim on 04/03/23
 */
@Configuration
public class GreetingServiceConfig {

    @Bean
    ConstructorGreetingService constructorGreetingService() {
        return new ConstructorGreetingService();
    }


    @Bean
    SetterGreetingService setterGreetingService() {
        return new SetterGreetingService();
    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService() {
        return new PropertyInjectedGreetingService();
    }

}
