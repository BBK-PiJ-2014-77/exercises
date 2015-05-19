package Phone;

/**
 * Created by digibrose on 01/12/2014.
 */
public class MobilePhone extends OldphoneImpl {

    private String[] LastNumbers;

    public MobilePhone(String brand){
        super(brand);
        LastNumbers = new String[10];
    }



    @Override
    public void call(String number) {
        for (int i=9; i > 0; i--){
            LastNumbers[i] = LastNumbers[i-1];
        }
        LastNumbers[0] = number;

        super.call(number);
    }

    public void ringAlarm(String Ring){
        if (Ring.equals("Old")) {
            System.out.println("Ring-Ring");
        }
    }
    private void playGame(String Game) {
            if (Game.equals("Tetris"))
            System.out.println("Tetris");
    }

    public void printLastNumbers() {
       for (int i=0; i<10;i++){
           System.out.println(LastNumbers[i]);
        }


    }

}
