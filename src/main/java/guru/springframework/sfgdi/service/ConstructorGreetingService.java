package guru.springframework.sfgdi.service;

import org.springframework.stereotype.Service;

/**
 * Created by kim on 04/03/23
 */

public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}