import java.util.Arrays;
import java.util.List;

/**
 * Created by digibrose on 02/03/2015.
 */
public class Towns {

    static boolean foundtown(List<String> towns, String town){
        boolean found = false;
        for (String t: towns){
            if (t.equals(town)){
                found = true;
                break;
            }
        }
        return found;
    }

    public static void main(String[] args){
        List<String> towns = Arrays.asList("A", "B", "C");

    //    System.out.println(foundtown(towns, "A"));
    //    System.out.println(foundtown(towns, "D"));

        System.out.println(towns.contains("A"));
        System.out.println(towns.contains("D"));

    }

}
