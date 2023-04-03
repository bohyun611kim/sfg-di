package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controller.ConstructorInjectedController;
import guru.springframework.sfgdi.controller.MyController;
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

    System.out.println("--- constructorInjectedController");
    ConstructorInjectedController constructorInjectedController = ctx.getBean(guru.springframework.sfgdi.controller.ConstructorInjectedController.class);
    System.out.println(constructorInjectedController.getGreeting());

  }

}