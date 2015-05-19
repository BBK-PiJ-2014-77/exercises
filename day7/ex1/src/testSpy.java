/**
 * Created by digibrose on 10/11/2014.
 */
public class testSpy {
    public static void main (String[] args) {
        Spy Gerald = new Spy(1234);
        Spy Fred = new Spy(1235);
        Spy John = new Spy(1236);

        Gerald.die(1234);
        Fred.die(1235);
        John.die(1236);
    }
}
