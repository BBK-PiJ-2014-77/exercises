import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by digibrose on 20/01/2015.
 */
public class Collatz {

    public static List<Integer> Collatzcalc(int num){

        /**
         * base case
         */

        if (num == 1){
            List<Integer> answer = new ArrayList<Integer>();
            answer.add(num);
            return answer;
        }

        /**
         * Calcs
         */


        else {

            int num2 = 0;

            if (num % 2 == 0 ){
                num2 = num/2;
            }
            else {
                num2 = (3* num) +1 ;
            }
            List<Integer> deeper = Collatzcalc(num2);
            List<Integer> answer = new ArrayList<Integer>();
            answer.add(num);
            answer.addAll(deeper);
            return answer;
        }
    }


}
