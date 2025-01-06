package my.interview.prep.stream.ramesh;

import java.util.Arrays;
import java.util.List;

public class EvenNumberFromList {

    public static void evenNumber(List<Integer> numbers){
        numbers.stream().filter(num->num%2==0).forEach(System.out::println);
                //.toList();
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

        evenNumber(numbers);
        /*
        //use this when return type is List<Integer> and we are collecting the even numbers in a list
        System.out.println(evenNumber(numbers));*/
    }
}
