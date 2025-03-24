package my.interview.prep.stream.ramesh;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EachCharOccurrence {

    public static void main(String[] args) {
        String str = "hello world";

        //string to stream of char
        IntStream stream = str.chars();                     //we cant use char array cause Arrays.stream(char[]) does not exist for primitive char because the Stream API has no direct support for char primitives. More in the word doc (15/01/25)
        //IntStream return the ASCII value of each char

        Map<Character, Long> characterLongMap = stream.mapToObj(c -> (char) c)     //convert ascii value to char. mapToObject is use to change the type
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));        //Function.identity() return each char from stream and Collectors.counting() count the frequency of each char

        characterLongMap.forEach((key,value)->{
            System.out.println("Char: "+key);
            System.out.println("Frequency: "+value);
        });
    }
}
