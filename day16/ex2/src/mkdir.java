import java.io.File;
import java.util.Scanner;

/**
 * Created by digibrose on 02/02/2015.
 */
public class mkdir {
    public static void main (String[] args){


        File newdir = new File(args[0]);
        System.out.println(args[0]);
        newdir.mkdir();

    }

}
