package compi.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"en", "default"})
public class PrimaryGreetingService implements GreetingService {
    public String sayGreeting() {
        return "Hello - Primary Greeting Service";
    }
}
