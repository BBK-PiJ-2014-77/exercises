package NoahAnimals;

import NoahInt.AnimalsInt;
import NoahParentClasses.LiveBirth;

/**
 * Created by digibrose on 05/12/2014.
 */
public class Bear extends LiveBirth implements AnimalsInt {

    private String name = "Bear";

    @Override
    public void call(String name) {
        
    }

    @Override
    public String makeSound() {
        return "Grrrrr!";
    }
}
