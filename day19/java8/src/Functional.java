import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by digibrose on 02/03/2015.
 */
public class Functional {

    public static void main (String[] args){
        final List<String> friends = Arrays.asList("John", "Fred", "John");

        List<String> NewFriends = new ArrayList<>();

        for(String s: friends){
            NewFriends.add(s.toUpperCase());
        }
        System.out.println(NewFriends);

        List<String> NewFriends2 = new ArrayList<>();

        friends.forEach(name -> NewFriends2.add(name.toUpperCase()));
        System.out.println(NewFriends2);

        List<String> NewFriends3 = new ArrayList<>();

        NewFriends3 = friends.stream()
                    .map(name -> name.toUpperCase())
                .collect(Collectors.toList());

            System.out.println(NewFriends3);


        LinkedList<Function<String, String>> Functionlist = new LinkedList();
                Functionlist.add(x -> x.toUpperCase());
                Functionlist.add(x -> x.toLowerCase());

        List<String> NewFriends4 = new ArrayList();

        NewFriends4 = friends.stream()
                    .map(Functionlist.get(0))
                .collect(Collectors.toList());

        System.out.println(NewFriends4);

        List<String> NewFriends5 = new ArrayList();

        NewFriends5 = friends.stream()
                .map(Functionlist.get(1))
                .collect(Collectors.toList());

        System.out.println(NewFriends5);



    }

}
