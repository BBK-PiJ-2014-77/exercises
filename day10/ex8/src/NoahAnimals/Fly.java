package NoahAnimals;

import NoahInt.FlyingAnimalInt;
import NoahParentClasses.EggLaying;

/**
 * Created by digibrose on 04/12/2014.
 */
public class Fly extends EggLaying implements FlyingAnimalInt {

    private String name = "Fly";

    public Fly() {

 //       super(name);
    }

    @Override
    public String makeSound() {
        return "chitter chitter";
    }
}
