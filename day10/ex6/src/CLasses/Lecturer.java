package CLasses;

/**
 * Created by digibrose on 03/12/2014.
 */
public class Lecturer extends Teacher {

    /**
     * YOu need to have a matching constructor
     * @param name
     */

    public Lecturer(String name) {
        super(name);
    }

    /**
     * Do Reseatch Method
     * @param topic
     */

    public void doResearch(String topic) { System.out.println("Doing research on: " + topic);
    }
}

