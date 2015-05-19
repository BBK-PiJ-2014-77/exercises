package TestPerson;

import Person.Person;
import Person.PriorityPersonQue;

/**
 * Created by digibrose on 01/12/2014.
 */
public class PriorityPersonQueTest {

    public static void main (String[] args) {

 //       System.out.println("test");

        Person Fred = new Person(67, "Fred");
        Person Sid = new Person(29, "Sid");
        Person Able = new Person(66, "Able");
        Person John = new Person(28, "John");
        Person Jerry = new Person(7, "Jerry");
        Person Ant = new Person(14, "Ant");

        PriorityPersonQue Tesco = new PriorityPersonQue();
        Tesco.insert(Jerry);
        Tesco.insert(John);
        Tesco.insert(Fred);
        Tesco.insert(Ant);
        Tesco.insert(Sid);
        Tesco.insert(Able);


        System.out.println(Tesco.CountList());
        int LL = Tesco.CountList();

       for (int i = 0; i < LL; i++) {
              System.out.println(Tesco.retrieve().returnname());
       }

    }


}
