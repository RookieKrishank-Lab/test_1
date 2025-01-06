package my.interview.prep.stream.ramesh;

import java.util.stream.IntStream;

public class SumOfAllDigit {

    public static void main(String[] args) {

        /*IntStream intStream = IntStream.of(1, 2, 3);
        int digitSum = intStream.sum();
        System.out.println(digitSum);*/

        int digit = 123;
        //we cant convert int to stream directly first we need to convert to string than char

        IntStream stream = String.valueOf(digit).chars();

        //instead of map we cant use mapToObject as it will convert to integer and then we cant use sum(). As sum() can be use in numeric stream
//        int sum = stream.map(chars -> (Integer) chars).sum();
//        int sum = stream.map(chars -> chars - '0').sum();
        int sum = stream.map(chars -> Character.getNumericValue(chars)).sum();
        System.out.println(sum);

    }
}
