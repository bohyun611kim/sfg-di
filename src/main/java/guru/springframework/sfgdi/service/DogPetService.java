package guru.springframework.sfgdi.service;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by kim on 04/03/23
 */


@Service
public class DogPetService implements PetService {

    @Override
    public String getPetType() {
        return "Dogs are the Best!";
    }
}
