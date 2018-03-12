package compi.springframework.services;

import compi.springframework.repositories.GreetingRepository;

public class EnglishGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public EnglishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public String sayGreeting() {
        return greetingRepository.getEnglishGreeting();
    }
}
