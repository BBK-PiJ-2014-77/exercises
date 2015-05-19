/**
 * Created by digibrose on 03/11/2014.
 */
public class Arrayprint {
    int[] src;

    public Arrayprint(int[] src) {
        this.src = src;
    }

    public void putout() {
        int ln = this.src.length;
     //   System.out.println(ln);
        int i;
        for (i = 0; i < ln; i++) {
            System.out.print(this.src[i]);
      //      System.out.println(ln);
        }
    }
}
