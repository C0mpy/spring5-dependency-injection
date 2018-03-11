package compi.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO = "Hello Everybody!";

    public String sayGreeting() {
        return HELLO;
    }
}
