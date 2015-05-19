/**
 * Created by digibrose on 05/01/2015.
 */
public class ManualPersonTest {

    public static void main (String[] args) {
        Person JB = new Person();
        String initials = JB.getInitials("John  Bond");
        System.out.println(initials);

        String test = "John  Bond";
        String[] word = test.split(" ");
        System.out.println(word[0]);
        System.out.println(word[1]);
        System.out.println(word.length);
        System.out.println(word[2]);
        System.out.println(word[1].hashCode());

    }

}
