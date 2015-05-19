/**
 * Created by digibrose on 06/11/2014.
 */
public class TestMatrix {
    public static void main (String[] args){
        Matrix TM = new Matrix(5, 5);
        TM.setElement(1, 1, 5);
        TM.setRow(2, "12345");
        TM.setColumn(3, "54321");

        for (int i=0; i < 5; i++) {
            for (int j=0; j < 5; j++) {
                System.out.print(TM.twod[i][j]);
            }
            System.out.println("");
        }

        System.out.println(TM.toString());
        Matrix TM2 = new Matrix("[1,2,3,4,5;5,4,3,2,1.]");

    }
}
