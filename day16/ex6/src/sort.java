import java.util.LinkedList;

/**
 * Created by digibrose on 04/02/2015.
 */
public class sort {



    public static void main(String[] args){
        LinkedList<String> sortbuffer= new LinkedList<String>();
        sortbuffer.add("Test string");
        sortbuffer.add("ZTest last string");
        for (int i = 0; i < sortbuffer.size(); i++){
            System.out.println(alpha(sortbuffer.get(i), "Btest", 0));
            if (alpha(sortbuffer.get(i), "Btest", 0)){
                sortbuffer.add(i, "Btest");
            }
        //    else if (i == sortbuffer.size()){
         //       sortbuffer.add("Btest");
          //  }
        }

        System.out.println(sortbuffer.toString());

      //  String A = "The difference is here AB";
      //  String B = "The difference is here A";
      //  System.out.println(alpha(A, B, 0));

   }

    private static boolean alpha(String one, String two, int place){

        if (one.charAt(place) > two.charAt(place)){
            return false;
        }
        else if (one.charAt(place) < two.charAt(place)){
            return true;
        }
        else if (place == one.length()-1 && place == two.length() -1){
            return true;
        }
        else if (place == one.length()-1 && place != two.length()-1 ){
            return true;
        }
        else if (place != one.length()-1 && place == two.length()-1){
            return false;
        }
        else {
            boolean alpha = alpha(one, two, place +1);
            return alpha;
        }

    }





}
