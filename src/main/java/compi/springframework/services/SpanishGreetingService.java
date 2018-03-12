package compi.springframework.services;

import compi.springframework.repositories.GreetingRepository;

public class SpanishGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public SpanishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public String sayGreeting() {
        return greetingRepository.getSpanishGreeting();
    }
}
