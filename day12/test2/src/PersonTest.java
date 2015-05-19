import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

        @Test
        public void testsNormalName() {
            Person p = new Person();
            String input = "Dereck Robert Yssirt";
            String output = p.getInitials(input);
            String expected = "DRY";
            assertEquals(expected, output);
        }

        @Test
        public void testsDoubleSpace() {
            Person p = new Person();
            String input = "John  Bond";
            String output = p.getInitials(input);
            String expected = "JB";
            assertEquals(expected, output);
        }

    }

