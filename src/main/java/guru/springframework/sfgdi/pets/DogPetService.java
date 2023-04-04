package guru.springframework.sfgdi.pets;


/**
 * Created by kim on 04/03/23
 */

public class DogPetService implements PetService {

    @Override
    public String getPetType() {
        return "Dog are the Best!";
    }
}
