import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by digibrose on 26/01/2015.
 */
public class MeanAverage {

    public static void main(String[] args){

        MeanAverage.launch();

    }

    private static void launch() {

        Scanner input = new Scanner(System.in);
        String number = null;
        String number2 = null;
        int n = 0;
        int n2 = 0;
        List<Integer> numbers = new ArrayList<Integer>();
        List<Integer> loop = new ArrayList<Integer>();


        for (int k = 0; k < 1; k++) {
            System.out.println("How many numbers do you want to average?");
            number2 = input.next();

            loop = MeanAverage.NumberGetter(number2);
            n2 = loop.get(0);
            k = k + loop.get(1);




    //        try {
    //            n2 = Integer.parseInt(number2);
    //        } catch (NumberFormatException ex) {
    //            System.out.println("This is not a number");
    //            k--;
    //        }
        }

            List<Integer> loop2 = new ArrayList<Integer>();

            for (int i = 1; i <= n2; i++) {
                System.out.println("Give me a number");
                number = input.next();

                loop2 = MeanAverage.NumberGetter(number);
                n = loop2.get(0);
                i = i + loop2.get(1);

      //          try {
      //              n = Integer.parseInt(number);
      //          } catch (NumberFormatException ex){
      //              System.out.println("This is not a number");
      //              i--;
      //          }

                numbers.add(n);
            }

        double total = 0.0;

        for (int j = 0; j < numbers.size(); j++){

            total = total + numbers.get(j);

        }

        double av = 0.0;
        av = total / numbers.size();
        System.out.println(av);
        }

    private static List<Integer> NumberGetter(String number){
        int n = 0;
        int m = 0;

        try {
            n = Integer.parseInt(number);
        } catch (NumberFormatException ex){
            System.out.println("This is not a number");
            m = -1;
        }
        List<Integer> reval = new ArrayList<Integer>();
        reval.add(n);
        reval.add(m);
        return reval;
    }

    }






