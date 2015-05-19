import java.io.*;

/**
 * Created by digibrose on 04/02/2015.
 */
public class tr {

    public static void main(String[] args){

        File file = new File(args[0]);
        int swaplength = args[1].length();
        try {
            BufferedReader in = new BufferedReader(new FileReader(file));
            String Line;
            while ((Line = in.readLine()) != null){
                for (int i=0; i <= Line.length() - swaplength; i++){
                    if (Line.substring(i, i+swaplength).equals(args[1])){
                        Line = Line.substring(0, i) + args[2] + Line.substring(i + swaplength, Line.length());
                    }
                }
                System.out.println(Line);
            }
            in.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not Found");
        } catch (IOException e) {
            e.printStackTrace();
        }


        }

    }


