/**
 * Created by digibrose on 17/11/2014.
 */
public class Person {

    private String name;
    private int age;
    private Person next;

    public Person(int age, String name) {
        this.name = name;
        this.age = age;
    }

    public void setnext (Person person) {
        this.next = person;
    }

    public Person returnnext() {
        return next;
    }

    public String returnname() {
        return name;
    }



}
