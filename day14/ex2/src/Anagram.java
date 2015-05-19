import java.util.List;
import java.util.ArrayList;

/**
 * Created by digibrose on 19/01/2015.
 */
public class Anagram {


    public static List<String> getAnagrams(String s) {

        /**
         * Base Case
         */

        if (s.length() == 1) {
            List<String> result = new ArrayList<String>();
            result.add(s);
            return result;
        }

        /**
         * loop to remove first character then call recursively to obtain a smaller list until base case
         * this is then fed into the main list with a another loop
         * then followed by shuffling of the characters.
         */

        else {
            List<String> anagrams = new ArrayList<String>();
            for (int i = 0; i < s.length(); i++) {
                    String rest = s.substring(1, s.length());
                    List<String> anagramsofrest = getAnagrams(rest);
                    for (int y = 0 ; y < anagramsofrest.size(); y++) {
                        anagrams.add(s.charAt(0) + anagramsofrest.get(y));
                    }
                s = s.substring(1, s.length()) + s.substring(0, 1);
            }
            return anagrams;
        }
    }
}
