/**
 * Created by digibrose on 26/01/2015.
 */
public class Patient {

    int year;
    String name;

    public Patient(String name, int year) {

        if (year < 0 ) throw new IllegalArgumentException("year negative");
        if (year > 130 ) throw new IllegalArgumentException("too old");

    this.year = year;
        this.name = name;

    }


}
