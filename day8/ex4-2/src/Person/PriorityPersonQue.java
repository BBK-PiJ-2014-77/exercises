package Person;


/**
 * Created by digibrose on 28/11/2014.
 */
public class PriorityPersonQue implements PersonQue {

    private Person head;
    private Person tail;


    public PriorityPersonQue() {
        head = null;
    }

    @Override
    public void insert(Person person) {
        Person floater;
        if (head == null) {
            head = person;
        } else {
            Person stepper = head;
            if (head.returnage() < 65 && person.returnage() > 65) {
                floater = head;
                head = person;
                person.setnext(floater);
            }
            else if (head.returnage() < 18 && person.returnage() > 18) {
                floater = head;
                head = person;
                person.setnext(floater);
            }
            else {
                while (stepper != null) {
                    if (stepper.getnext() == null) {
                       stepper.setnext(person);
                       break;
                    } else if (stepper.getnext().returnage() < 65 && person.returnage() > 65) {
                       floater = stepper.getnext();
                       stepper.setnext(person);
                       stepper.getnext().setnext(floater);
                       break;
                    }  else if (stepper.getnext().returnage() < 18 && person.returnage() > 18) {
                        floater = stepper.getnext();
                        stepper.setnext(person);
                        stepper.getnext().setnext(floater);
                        break;
                    }  else {
                        stepper = stepper.getnext();
                    }
                }
            }
        }
    }

    public Person retrieve() {
        Person result = head;
        head = head.getnext();
        return result;
    }

    public int CountList() {
        int i = 0;
        Person Stepper = head;
        while (Stepper != null) {
            i++;
            Stepper = Stepper.getnext();
        }
        return i;
    }
}
