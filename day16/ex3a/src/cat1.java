import java.io.*;

/**
 * Created by digibrose on 02/02/2015.
 */
public class cat1 {

    public static void main (String[] args ){

        for (int i = 0; i < args.length; i++) {
            File filein = new File(args[i]);
            try {
                BufferedReader in = new BufferedReader(new FileReader(filein));
                String line;
                while ((line = in.readLine()) != null) {
                    System.out.println(line);
                }
                in.close();
            } catch (FileNotFoundException e) {
                System.out.println("file does not exist");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
