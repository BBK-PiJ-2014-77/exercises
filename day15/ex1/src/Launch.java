import java.util.ArrayList;
import java.util.List;

/**
 * Created by digibrose on 26/01/2015.
 */
public class Launch {

    public static void main (String[] args){

        Launch.launch(2);
        Launch.launch(4);
        Launch.launch(6);


    }



    public static void launch(int userInput) {
         List<Integer> intList = new ArrayList<Integer>();
         intList.add(1);
         intList.add(2);
         intList.add(3);
         intList.add(4);
         intList.add(5);
         intList.add(6);
         try {
             intList.remove(0);
             System.out.println(intList.get(userInput));
             intList.remove(0);
             System.out.println(intList.get(userInput));
             intList.remove(0);
             System.out.println(intList.get(userInput));
             intList.remove(0);
             System.out.println(intList.get(userInput));
             intList.remove(0);
             System.out.println(intList.get(userInput));
             intList.remove(0);
             System.out.println(intList.get(userInput));
             intList.remove(0);
             System.out.println(intList.get(userInput));
             } catch (IndexOutOfBoundsException ex) {
             //ex.printStackTrace();
             System.out.println("testing catch output");
             }
    }



}
