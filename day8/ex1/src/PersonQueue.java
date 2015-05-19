/**
 * Created by digibrose on 17/11/2014.
 */
public class PersonQueue {
    private Person head;
    private Person tail;


    public PersonQueue() {
        head = null;
        tail = null;
    }

    /**
     * Adds another person to the que
     */
    public void insert(Person person) {
        if (head == null) {
            head = person;
            tail = person;
        } else {
            tail.setnext(person);
            tail = person;
        }
    }


    /**
     * Removes a person from the queue;
     */
    public Person retrieve() {
            Person result = head;
            head = head.returnnext();
            return result;
        }
}
