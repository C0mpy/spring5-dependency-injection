package compi.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {

    public String sayGreeting() {
        return "Hello - I was injected by the setter";
    }
}
