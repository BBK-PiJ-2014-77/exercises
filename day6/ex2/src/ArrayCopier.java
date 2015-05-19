import com.sun.xml.internal.messaging.saaj.soap.ver1_1.BodyElement1_1Impl;

/**
 * Created by digibrose on 04/11/2014.
 */
public class ArrayCopier {
    private int[] A1;
    private int[] A2;

    public ArrayCopier(int[] A1, int[] A2) {
        this.A1 = A1;
        this.A2 = A2;

    }

    public void ArraySwap() {
        int l1 = this.A1.length;
        int l2 = this.A2.length;

//        System.out.println(l1);
//        System.out.println(l2);

        int[] B1;
        int[] B2;
        B1 = new int[l1];
        B2 = new int[l2];

        for (int i = 0; i < l1; i++) {
            if (i > l2 - 1) {
                B1[i] = 0;
            } else {
                B1[i] = this.A2[i];
            }
        }
        for (int i = 0; i < l2; i++) {
            if (i > l1 - 1) {
                B2[i] = 0;
            } else {
                B2[i] = this.A1[i];
            }
        }

            this.A1 = B1;
            this.A2 = B2;
            System.out.println("Swapped the first is: ");

            for (int j = 0; j < l1; j++) {
                System.out.print(this.A1[j]);
            }
            System.out.println("");
            System.out.println("And the second is: ");
            for (int j = 0; j < l2; j++) {
                System.out.print(this.A2[j]);
            }


        }
}

