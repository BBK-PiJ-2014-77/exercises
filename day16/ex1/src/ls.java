import java.io.*;
import java.util.Scanner;

/**
 * Created by digibrose on 02/02/2015.
 */
public class ls {

    public static void main (String[] args){

        System.out.println("Which directory do you want a list from?");
        Scanner Inp = new Scanner(System.in);
        String Input = Inp.nextLine();

        File file = new File(Input);
            String[] lsarray = file.list();
            int size = lsarray.length;
            for (int i = 0; i<size; i++ ){
                System.out.println(lsarray[i]);
            }
        }

    }

