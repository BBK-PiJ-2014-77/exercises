import java.util.ArrayList;
import java.util.List;

/**
 * Created by digibrose on 22/01/2015.
 */
public class BSTest {

    public static void main (String[] args){


        List<Integer> Test = new ArrayList<Integer>();
     //   Test.add(1);
     //   Test.add(7);
     //   Test.add(6);
     //   Test.add(8);
     //   Test.add(32);
     //   Test.add(12);
     //   Test.add(11);
     //   Test.add(16);

        int T ;

        for (int i = 0 ; i < 51; i++) {
            T = (int) Math.abs(100 * Math.random());

   //         System.out.println(T);

            Test.add(T);
        }

     //   System.out.println(Test);

    //    System.out.println(T);



    //    System.out.println(BinarySearch.Search(Test, 11));

        System.out.println(BinarySearch.Search(BinarySearch.MergeSort(Test), 1));






    }

}
