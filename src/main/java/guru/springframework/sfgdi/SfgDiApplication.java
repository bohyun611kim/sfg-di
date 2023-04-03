package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controller.ConstructorInjectedController;
import guru.springframework.sfgdi.controller.I18nController;
import guru.springframework.sfgdi.controller.MyController;
import guru.springframework.sfgdi.controller.PropertyInjectedController;
import guru.springframework.sfgdi.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


/**
 * Created by kim on 04/03/23
 */
@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

        System.out.println("--- I18N");
        I18nController i18nController = ctx.getBean(guru.springframework.sfgdi.controller.I18nController.class);
        System.out.println(i18nController.sayGreeting());


        MyController myController = (MyController) ctx.getBean("myController");
        System.out.println("--- Primary bean");
        String greeting = myController.getGreeting();
        System.out.println(greeting);

        System.out.println("------ Property");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx
            .getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("--------- Setter");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx
            .getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("-------- Constructor");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx
            .getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());


    }

}