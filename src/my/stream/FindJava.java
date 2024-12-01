package my.stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FindJava {

    public static String findWord(String[] strings){
        return Arrays.stream(strings)
                .filter(s -> s.toLowerCase().equals("java") || s.toUpperCase().equals("JAVA")  || s == "java" || s == "Java")
//                .peek(System.out::println)
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        String[] strings ={"python","c", "jaVa"};
        System.out.println(findWord(strings));


    }
}
