/**
 * Created by digibrose on 24/11/2014.
 */
public class TreeIntSetTest {
    public static void main (String[] args){
        TreeIntSet IT1 = new TreeIntSet(6);
        IT1.add(5);
        IT1.add(8);
        IT1.add(3);
        IT1.add(14);
        IT1.add(2);
        IT1.add(21);
        IT1.add(7);
        IT1.add(7);

        System.out.println("Does IT1 contain 2? " + IT1.contains(2));
        System.out.println("Does IT1 contain 32? " + IT1.containVerbose(32));
        System.out.println("Does IT1 contain 2? " + IT1.containVerbose(2));
        System.out.println(IT1.toString());

        ListIntSet LT1 = new ListIntSet(6);
        LT1.add(5);
        LT1.add(8);
        LT1.add(3);
        LT1.add(14);
        LT1.add(2);
        LT1.add(21);
        LT1.add(7);
        LT1.add(7);

        System.out.println("Does LT1 contain 2? " + LT1.containVerbose(2));

    }
}
