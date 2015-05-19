package NoahInt;

/**
 * Created by digibrose on 03/12/2014.
 */
public interface AnimalsInt {

    /**
     * Call Method
     */
    default void call(String Animal) {
    System.out.println(Animal + " coming.");
    }

    /**
     * Reproduce Method
     */

    void reproduce();

    String makeSound();



}
