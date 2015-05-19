/**
 * Created by digibrose on 06/11/2014.
 */
public class Matrix {

    public int[][] twod;
    private int A1;
    private int A2;

    public Matrix(int A1, int A2){

        this.twod = new int[A1][A2];
        this.A1 = A1;
        this.A2 = A2;
        for (int i=0; i < A1; i++) {
            for (int j=0; j<A2; j++) {
                this.twod[i][j] = 1;
            }
        }

    }

    public Matrix(String Input) {

        int ln = Input.length();
        int A1 = 1;
        for (int i = 0; i < ln; i++) {
            if (Input.charAt(i) == ';') {
                A1++;
            }
        }
        System.out.println(A1);

        int A2 = 1;
        for (int i = 0; i < ln; i++) {
            if (Input.charAt(i) == ';') {
                break;
            }
            if (Input.charAt(i) == ',') {
                A2++;
            }
        }
        System.out.println(A2);

        this.twod = new int[A1][A2];
        this.A1 = A1;
        this.A2 = A2;

//        for (int i = 0; i < A1; i++) {
//            for (int j = 0; j < A2; j++) {
//                this.twod[i][j] = 1;
//            }
//        }

        int l = 0;
        int k = 0;

        for (int i = 0; i < ln; i++) {
//            System.out.println(ln);
//            System.out.println(Input.charAt(i));
            if (Input.charAt(i) == ';'){
                l++;
                k = 0;
            }

            if (k < A2) {
                if (Input.charAt(i) >= '0' && Input.charAt(i) <= '9') {
                    this.twod[l][k] = Character.getNumericValue(Input.charAt(i));
                    k++;
                }
            }
        }


        for (int i = 0; i < A1; i++) {
            for (int j = 0; j < A2; j++) {
                System.out.print(this.twod[i][j]);
            }
        System.out.println("");
        }
    }

    public void setElement(int A1, int A2, int val) {

        this.twod[A1][A2] = val;
    }

    public void setRow(int A1, String Input) {

        int l1 = Input.length();

        if (l1 != this.A2) {
            return;
        }
        else {
        for (int i=0; i<this.A2; i++) {
            this.twod[A1][i] = Character.getNumericValue(Input.charAt(i));
        }
        }

    }

    public void setColumn(int A2, String Input) {

        int l1 = Input.length();

        if (l1 != this.A1) {
            return;
        }
        else {
            for (int i=0; i<this.A1; i++) {
                this.twod[i][A2] = Character.getNumericValue(Input.charAt(i));
            }
        }
    }

    public String toString() {
        String OutString = "";


        for (int i=0; i < this.A1; i++) {
            for (int j=0; j < this.A2; j++) {
                if (i==0 && j==0) {
                    OutString = "[" + this.twod[i][j];
                }
                else {
                    OutString = OutString + "," + this.twod[i][j];
                }
            }
            OutString = OutString + ";";
        }
        OutString = OutString + "]";
        return OutString;

    }



}
