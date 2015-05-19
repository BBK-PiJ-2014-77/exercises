/**
 * Created by digibrose on 17/11/2014.
 */
public class TestPersonQueue {
    public static void main(String[] args){
        Person John = new Person(28, "John");
        Person Fred = new Person(34, "Fred");
        Person Sid = new Person(45, "Sid");

        PersonQueue Tesco = new PersonQueue();
        Tesco.insert(John);
        Tesco.insert(Fred);
        Tesco.insert(Sid);

        System.out.println(Tesco.retrieve().returnname());
        System.out.println(Tesco.retrieve().returnname());
        System.out.println(Tesco.retrieve().returnname());


    }

}
