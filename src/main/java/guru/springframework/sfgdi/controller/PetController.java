package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.service.PetService;
import org.springframework.stereotype.Controller;

/**
 * Created by kim on 04/03/23
 */

@Controller
public class PetController {


    private final PetService petService;

    // @Profile 찾아보고 주입
    public PetController(PetService petService) {
        this.petService = petService;
    }

    public String whichPetIsTheBest() {
        return petService.getPetType();
    }
}
