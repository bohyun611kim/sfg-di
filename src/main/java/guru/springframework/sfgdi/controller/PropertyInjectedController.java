package guru.springframework.sfgdi.controller;


import guru.springframework.sfgdi.service.GreetingService;
import guru.springframework.sfgdi.service.SetterGreetingService;
import jdk.nashorn.internal.objects.annotations.Constructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.stereotype.Controller;

/**
 * Created by kim on 04/03/23
 */

@Controller
public class PropertyInjectedController {

  @Qualifier("propertyInjectedGreetingService")
  @Autowired
  public GreetingService greetingService;

  public String getGreeting() {
    return greetingService.sayGreeting();
  }
}
