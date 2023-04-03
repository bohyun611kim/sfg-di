package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controller.ConstructorInjectedController;
import guru.springframework.sfgdi.controller.MyController;
import guru.springframework.sfgdi.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

  public static void main(String[] args) {
    ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

    System.out.println("--- myController");
    MyController myController = (MyController) ctx.getBean("myController");
    String greeting = myController.sayHello();
    System.out.println(greeting);

    System.out.println("--- constructor");
    ConstructorInjectedController constructorInjectedController = ctx.getBean(guru.springframework.sfgdi.controller.ConstructorInjectedController.class);
    System.out.println(constructorInjectedController.getGreeting());

    System.out.println("--- setter");
    SetterInjectedController setterInjectedController = (SetterInjectedController)ctx.getBean("setterInjectedController");
    System.out.println(setterInjectedController.getGreeting());

  }

}