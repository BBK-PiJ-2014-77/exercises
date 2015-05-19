import java.io.*;

/**
 * Created by digibrose on 02/02/2015.
 */
public class cp {

    public static void main (String[] args ){

            File filein = new File(args[0]);
            File fileout = new File(args[1]);

            try {
                BufferedReader in = new BufferedReader(new FileReader(filein));
                BufferedWriter out = new BufferedWriter(new FileWriter(fileout));
                String line;
                while ((line = in.readLine()) != null) {
                    out.write(line);
                    out.newLine();
                }
                out.close();
                in.close();
            } catch (FileNotFoundException e) {
                System.out.println("file does not exist");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

}
