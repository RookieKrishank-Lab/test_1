package my.interview.prep.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//inside list we have multiple list as an element. We need to merge them in a single list [["j","W","e"],["a","s","d"]]  -> ["j","W","e","a","s","d"]
//from the list get the element starts with s
public class SingleList {

    public static void main(String[] args) {


        List<List<String>> list = Arrays.asList(
                Arrays.asList("j","W","e"),
                Arrays.asList("a","s","d"),
                Arrays.asList("z","x","c")
        );

        List<String> sub = list.stream().flatMap(elements-> elements.stream()).collect(Collectors.toList());          //.peek(strings -> System.out.println(strings));

        System.out.println(sub);

        List<String> sStrings = sub.stream().filter(elements -> elements.startsWith("s")).toList();
        System.out.println(sStrings);

    }

}
