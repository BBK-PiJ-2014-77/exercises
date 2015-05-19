/**
 * Created by digibrose on 24/11/2014.
 */
public interface IntSet {

    void add(int value);

    boolean contains(int value);

    /**
     * Print the value on the screen
     */
    boolean containVerbose(int value);

    String toString();

}
