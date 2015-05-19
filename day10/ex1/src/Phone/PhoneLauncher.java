package Phone;

/**
 * Created by digibrose on 01/12/2014.
 */
public class PhoneLauncher {

    public static void main (String[] args){
        PhoneLauncher launcher = new PhoneLauncher();
        launcher.launch();
    }
    public void launch(){

            SmartPhone SPhone = new SmartPhone("Apple");

            for (int i = 1; i <= 4;i++) {
            SPhone.call("0112233");
            SPhone.call("0123456");
            SPhone.call("0122456");
            }
            SPhone.printLastNumbers();
            SPhone.ringAlarm("Old");
            System.out.println(SPhone.findPosition());

            SPhone.call("00112233");

            System.out.println(SPhone.getBrand());

             SPhone.playGame("Tetris");




    }

}
