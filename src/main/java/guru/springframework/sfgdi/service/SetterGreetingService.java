package guru.springframework.sfgdi.service;

import org.springframework.stereotype.Service;

/**
 * Created by kim on 04/03/23
 */

@Service
public class SetterGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}
