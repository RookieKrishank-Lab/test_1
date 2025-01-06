package my.interview.prep.stream.ramesh;

import java.util.Arrays;
import java.util.List;

//Find the Square of the First Three Even Numbers using Java 8 Stream
public class SquareOfFirstThreeEven {

    public static void squareEven(List<Integer> list){
        list.stream().filter(num->num%2==0).limit(3).forEach(num-> System.out.println(num*num));
    }

    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8,10);

        squareEven(number);
    }
}
