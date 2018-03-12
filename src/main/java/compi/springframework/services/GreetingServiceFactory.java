package compi.springframework.services;

import compi.springframework.repositories.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    @Autowired
    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang) {

        switch (lang) {
            case "en":
                return new EnglishGreetingService(greetingRepository);
            case "de":
                return new GermanGreetingService(greetingRepository);
            case "es":
                return new SpanishGreetingService(greetingRepository);
            default:
                return new EnglishGreetingService(greetingRepository);
        }

    }
}
