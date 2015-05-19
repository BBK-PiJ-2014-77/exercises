/**
 * Created by digibrose on 03/12/2014.
 */
public class Guitar extends MusicalInstrument implements WoodenObjectInt {

    /**
     * Empty classs that gets methods from both a parent class and an Implementation
     *
     * @param args
     */

    public static void main(String[] args){

        Guitar stratocast = new Guitar();

        stratocast.play();
        stratocast.burn();


    }

}
