package guru.springframework.sfgdi.pets;

/**
 * Created by kim on 04/03/23
 */
public class CatPetService  implements PetService{

    @Override
    public String getPetType() {
        return "Cats are the Best!";
    }
}
