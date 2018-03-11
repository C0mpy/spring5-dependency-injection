package compi.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingService implements GreetingService {
    public String sayGreeting() {
        return "Hello - Primary Greeting Service";
    }
}
