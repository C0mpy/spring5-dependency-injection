package compi.springframework.config;

import compi.springframework.repositories.GreetingRepository;
import compi.springframework.services.GreetingService;
import compi.springframework.services.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository) {
        return new GreetingServiceFactory(greetingRepository);
    }

    @Bean
    @Primary
    @Profile({"default", "en"})
    GreetingService englishGreetingService(GreetingServiceFactory greetingServiceFactory) {
            return greetingServiceFactory.createGreetingService("en");
    }

    @Bean
    @Primary
    @Profile({"de"})
    GreetingService germanGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("de");
    }

    @Bean
    @Primary
    @Profile({"es"})
    GreetingService spanishGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.createGreetingService("es");
    }

}
