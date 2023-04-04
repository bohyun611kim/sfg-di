package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.service.ConstructorGreetingService;
import guru.springframework.sfgdi.service.I18NSpanishService;
import guru.springframework.sfgdi.service.I18nEnglishGreetingService;
import guru.springframework.sfgdi.service.PrimaryGreetingService;
import guru.springframework.sfgdi.service.PropertyInjectedGreetingService;
import guru.springframework.sfgdi.service.SetterGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

/**
 * Created by kim on 04/03/23
 */
@Configuration
public class GreetingServiceConfig {

    @Profile({"ES", "default"})
    @Bean("i18nService")
    I18NSpanishService i18NSpanishService() {
        return new I18NSpanishService();
    }

    @Profile("EN")
    @Bean
    I18nEnglishGreetingService i18nService() {
        return new I18nEnglishGreetingService();
    }

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService() {
        return new PrimaryGreetingService();
    }

    // --------------- DI3형제 -----------------
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
