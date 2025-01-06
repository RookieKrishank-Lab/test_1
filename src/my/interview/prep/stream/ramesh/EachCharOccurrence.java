package my.interview.prep.stream.ramesh;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EachCharOccurrence {

    public static void main(String[] args) {
        String str = "hello world";

        //string to stream of char
        IntStream stream = str.chars();
        //IntStream return the ASCII value of each char

        Map<Character, Long> characterLongMap = stream.mapToObj(c -> (char) c)     //convert ascii value to char. mapToObject is use to change the type
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));        //Function.identity() return each char from stream and Collectors.counting() count the frequency of each char

        characterLongMap.forEach((key,value)->{
            System.out.println("Char: "+key);
            System.out.println("Frequency: "+value);
        });
    }
}