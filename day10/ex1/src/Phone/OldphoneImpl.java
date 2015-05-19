package Phone;

import Phone.OldPhone;

/**
 * Created by digibrose on 02/12/2014.
 */
public class OldphoneImpl implements OldPhone{

    public OldphoneImpl(String brand) {
        this.brand = brand;
    }

    @Override
        public void call(String number) {
           System.out.println("Calling " + number);

    }

    private String brand = null;



    public String getBrand() { return brand;
    }
// ... there is no setter for brand

}
