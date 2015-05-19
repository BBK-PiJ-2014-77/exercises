import java.io.*;

/**
 * Created by digibrose on 02/02/2015.
 */
public class cp {

    public static void main(String[] args) {


        File filelast = new File(args[args.length - 1]);

        if (filelast.isDirectory()) {
            for (int i = 0; i <= args.length - 2; i++) {
                try {
                    File filein2 = new File(args[i]);
                    File filenewdir = new File(args[args.length - 1] + "/" + filein2.getName());
                    BufferedReader in = new BufferedReader(new FileReader(filein2));
                    BufferedWriter out = new BufferedWriter(new FileWriter(filenewdir));
                    String line;
                    while ((line = in.readLine()) != null) {
                        out.write(line);
                        out.newLine();
                    }
                    out.close();
                    in.close();
                } catch (FileNotFoundException e) {
                    System.out.println("file does not exist1");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else if (args.length != 2) {
            System.out.println("Not a directory");
        } else {
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
}