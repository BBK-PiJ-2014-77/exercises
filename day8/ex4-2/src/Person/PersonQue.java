package Person;

import Person.Person;

/**
 * Created by digibrose on 28/11/2014.
 */
public interface PersonQue {
     /**
     * Adds another person to the queue.
     */
    void insert(Person person);
    /**
    * Removes a person from the queue.
    */
    Person retrieve();
    }
