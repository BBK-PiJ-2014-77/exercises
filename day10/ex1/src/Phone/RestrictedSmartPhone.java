package Phone;

/**
 * Created by digibrose on 03/12/2014.
 */
public class RestrictedSmartPhone extends SmartPhone {


    public RestrictedSmartPhone(String brand) {
        super(brand);
    }

    /**
     * You can't restrict access to parent classes as that would breakdown substitutability
     * You can however block access by overiding the method
     * @param Game
     */

    @Override
    public void playGame (String Game){
        System.out.println("No access to games");
    }

}
