package Person;

/**
 * Created by digibrose on 17/11/2014.
 */
public class Person {

    private String name;
    private int age;
    private Person next = null;


    public Person(int age, String name) {
        this.name = name;
        this.age = age;
    }

    public void setnext (Person person) {
        this.next = person;
    }

    public Person getnext() { return next;}

    public String returnname() {
        return name;
    }

    public int returnage() {return age; }

}
