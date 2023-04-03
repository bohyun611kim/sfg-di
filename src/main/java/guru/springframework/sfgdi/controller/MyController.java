package guru.springframework.sfgdi.controller;

import org.springframework.stereotype.Controller;

/**
 * Created by kim on 04/03/23
 */

@Controller
public class MyController {

  public String sayHello() {

    System.out.println("Hello World!");

    return "Hi Kim";
  }
}
