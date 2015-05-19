package NoahInt;

/**
 * Created by digibrose on 04/12/2014.
 */
public interface FlyingAnimalInt {

    /**
     * Call Method
     */
    default void call(String Animal) {
        System.out.println(Animal + " coming when tired.");
    }

    /**
     * Reproduce Method
     */

    void reproduce();

    String makeSound();

    default void test(){
        System.out.println("test");
    }


}
