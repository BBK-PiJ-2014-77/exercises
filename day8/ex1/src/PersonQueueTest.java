import org.junit.Test;

import static org.junit.Assert.*;

public class PersonQueueTest {

    Person John = new Person(28, "John");
    Person Fred = new Person(34, "Fred");
    Person Sid = new Person(45, "Sid");



    @Test
    public void testInsertfirstperson() {
        PersonQueue Tesco = new PersonQueue();
        Tesco.insert(John);
        String expected = "John";
        String output = Tesco.retrieve().returnname();
        assertEquals(expected, output);


    }

    @Test
    public void testInsertmultiplepeople() {
        PersonQueue Tesco = new PersonQueue();
        Tesco.insert(John);
        Tesco.insert(Fred);
        String expected = "John";
        String output = Tesco.retrieve().returnname();
        assertEquals(expected, output);

    }
    @Test
    public void testretievesecondperson() {
        PersonQueue Tesco = new PersonQueue();
        Tesco.insert(John);
        Tesco.insert(Fred);
        Tesco.insert(Sid);
        String expected = "Fred";
        String output1 = Tesco.retrieve().returnname();
        String output = Tesco.retrieve().returnname();
        assertEquals(expected, output);

    }

    @Test
    public void testemptyfirstperson() {
        PersonQueue Tesco = new PersonQueue();
        //     Tesco.insert(John);
        String expected = null;
        String output = Tesco.retrieve().returnname();
        assertEquals(expected, output);

    }



}