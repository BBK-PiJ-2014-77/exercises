import java.util.Scanner;

/**
 * Created by digibrose on 04/11/2014.
 */
public class TestArrayCopier {
    public static void main (String[] args) {
        System.out.println("Please input a list of digits");
        Scanner In1 = new Scanner(System.in);
        String Sin1 = In1.next();
        int ln1 = Sin1.length();
        int[] First;
        First = new int[ln1];
        for (int i = 0; i < ln1; i++) {
            First[i] = Character.getNumericValue(Sin1.charAt(i));
        }
        for (int j = 0; j < ln1; j++) {
            System.out.println(First[j]);
        }

        System.out.println("Please input a second list of digits");
        Scanner In2 = new Scanner(System.in);
        String Sin2 = In2.next();
        int ln2 = Sin2.length();
        int[] Second;
        Second = new int[ln2];
        for (int i = 0; i < ln2; i++) {
            Second[i] = Character.getNumericValue(Sin2.charAt(i));
        }
        for (int j = 0; j < ln2; j++) {
            System.out.println(Second[j]);
        }

        ArrayCopier TwoArray = new ArrayCopier(First, Second);
        TwoArray.ArraySwap();
    }
}
