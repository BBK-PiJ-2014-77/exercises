package Phone;

/**
 * Created by digibrose on 01/12/2014.
 */
public class SmartPhone extends MobilePhone {

    public SmartPhone(String brand) {
        super(brand);
    }


    public void playGame(String Game) {
        if (Game.equals("Tetris"))
            System.out.println("Tetris");
    }


    public void browseWeb(String Web) {

    }

    public String findPosition() {
        String Blank = "Beep,Beep,Beep Long84.567 Lat0.01";
        return Blank;
    }

    @Override
    public void call(String number){
        if (number.substring(0, 2).equals("00")){
            System.out.println("Calling " + number + " through the internet");
        }
        else {
            super.call(number);
        }
    }



}
