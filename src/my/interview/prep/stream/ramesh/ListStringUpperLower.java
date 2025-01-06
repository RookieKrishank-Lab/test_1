package my.interview.prep.stream.ramesh;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

//Convert a List of Strings to Uppercase and Lowercase using Java 8 Stream
public class ListStringUpperLower {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("abC","Abc","aBc");

//        static Function<String,String> upperCase = s -> s.toUpperCase();
//        System.out.println("upper case"+);

        List<String> upperCaseString = strings.stream().map(string -> string.toUpperCase()).toList();
        List<String> lowerCaseString = strings.stream().map(string -> string.toLowerCase()).toList();

        System.out.println("Upper case : "+upperCaseString);
        System.out.println("Lowe case : "+lowerCaseString);
    }
}
