package CLasses;

/**
 * Created by digibrose on 03/12/2014.
 */
public class Teacher {

        private String name;

    /**
     * Constructor Method
     * @param name
     */

        public Teacher(String name) {
            this.name = name;
        }

    /**
     * Getter Method
     * @return
     */

        public String getName()
        { return name;
        }

    /**
     * Teach Method
     * @param lessonName
     */

        public void teach(String lessonName) {
            System.out.println("Teaching lesson: " + lessonName);
        }
}
