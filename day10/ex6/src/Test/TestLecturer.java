package Test;

/**
 * Import commands for separate package
 */


import CLasses.Lecturer;
import CLasses.Teacher;

public class TestLecturer {

    /**
     * Main Method
     * @param args
     */

    public static void main (String[] args) {

        Teacher Burt = new Teacher("Burt");
        Burt.teach("French");


        Lecturer Bart = new Lecturer("Bart");
        Bart.doResearch("Physics");

        Bart.teach("Physics");


    }
}
