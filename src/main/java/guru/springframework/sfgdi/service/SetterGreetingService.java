package guru.springframework.sfgdi.service;

/**
 * Created by kim on 04/03/23
 */

public class SetterGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}
