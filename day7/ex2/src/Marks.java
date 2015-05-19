import java.util.Scanner;

/**
 * Created by digibrose on 10/11/2014.
 */
public class Marks {
    private int students;
    private int distinctions;
    private int passes;
    private int failed;
    private int invalid;



    public static void main( String[] args) {
        Marks Test = new Marks();
        boolean understood = false;
        do {
            System.out.println("Input a mark");
            Scanner Input = new Scanner(System.in);
            int inp = Input.nextInt();
            if (inp == -1) {
                understood = true;
                break;
            }
            Test.students++;

            if (inp >= 70 && inp <= 100) {
                Test.distinctions++;
            }
            else if (inp >= 50 && inp <= 100) {
                Test.passes++;
            }
            else if (inp < 50) {
                Test.failed++;
            }
            else {
                Test.invalid++;
                Test.students--;
            }
        } while (understood != true);

        System.out.println("There are " + Test.students + " Students: " + Test.distinctions + " distinctions, " + Test.passes + " pass, " + Test.failed + " fails (plus " + Test.invalid + " invalid)" );
    }
}
