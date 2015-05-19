/**
 * Created by digibrose on 16/02/2015.
 */
public class Test {



    public static void main (String[] args) {

        DLList<String> test = new DLList<String>();

        test.add("one");
        test.add("two");
        test.add("three");
        test.add("four");

        test.showlist();
        test.reverselist();

        System.out.println(test.search("three"));
        System.out.println(test.search("six"));
    }




}
