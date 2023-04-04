package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.controller.SetterInjectedController;
import guru.springframework.sfgdi.service.SetterGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new SetterGreetingService());
    }


    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}
