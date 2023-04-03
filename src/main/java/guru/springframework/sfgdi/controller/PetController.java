package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.service.PetService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by kim on 04/03/23
 */

@Controller
public class PetController {


    private final PetService petService;
    
    public PetController(@Qualifier("catPetService") PetService petService) {
        this.petService = petService;
    }

    public String whichPetIsTheBest() {
        return petService.getPetType();
    }
}
