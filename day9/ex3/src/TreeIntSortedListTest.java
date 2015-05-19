/**
 * Created by digibrose on 27/11/2014.
 */
public class TreeIntSortedListTest {
    public static void main (String[] args) {
        TreeIntSortedList IT1 = new TreeIntSortedList(6);
        IT1.add(5);
        IT1.add(7);
        IT1.add(3);
        IT1.add(14);
        IT1.add(2);
        IT1.add(21);
        IT1.add(8);
        IT1.add(7);
        IT1.add(7);

        System.out.println("Does IT1 contain 14? " + IT1.contains(14));
        System.out.println("Does IT1 contain 21? " + IT1.containVerbose(21));

        System.out.println(IT1.toString());

        ListIntSortedList LT1 = new ListIntSortedList(6);
        LT1.add(5);
        LT1.add(7);
        LT1.add(3);
        LT1.add(14);
        LT1.add(2);
        LT1.add(7);
        LT1.add(7);
        LT1.add(21);

        System.out.println("Does LT1 contain 21? " + LT1.containVerbose(21));


    }
}
