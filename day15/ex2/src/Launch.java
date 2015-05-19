
    import java.util.ArrayList;
    import java.util.List;

    /**
     * Created by digibrose on 26/01/2015.
     */
    public class Launch {

        public static void main (String[] args){

            Launch.launch();


        }



        public static void launch() {
            String Test = null;
            try {
                Test.equals("any");
            } catch (NullPointerException ex) {
                ex.printStackTrace();
                System.out.println("catch test");
            } catch (Exception ex) { ex.printStackTrace();
            }
        }



    }




