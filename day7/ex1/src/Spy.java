/**
 * Created by digibrose on 10/11/2014.
 */
public class Spy {

    public static int spyCount = 0;
    private int id;

    public Spy(int id) {
        this.id = id;
        spyCount++;
        System.out.println("New ID " + this.id);
        System.out.println("Spy count " + spyCount);
    }

    public void die(int id) {
        System.out.println("Spy " + id + " has been eliminated");
        spyCount--;
        System.out.println("There are " + spyCount + " spies left");

    }



}
