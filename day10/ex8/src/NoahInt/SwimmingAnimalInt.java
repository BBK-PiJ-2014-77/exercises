package NoahInt;

/**
 * Created by digibrose on 04/12/2014.
 */
public interface SwimmingAnimalInt {
    /**
     * Call Method
     */
    default void call(String Animal ) {
        System.out.println(Animal + " not coming.");
    }

    /**
     * Reproduce Method
     */

    void reproduce();

    String makeSound();

}
