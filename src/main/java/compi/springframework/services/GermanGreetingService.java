package compi.springframework.services;

import compi.springframework.repositories.GreetingRepository;

public class GermanGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public GermanGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }

}
