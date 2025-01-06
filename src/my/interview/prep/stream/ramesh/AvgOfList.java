package my.interview.prep.stream.ramesh;

import java.util.Arrays;
import java.util.List;

public class AvgOfList {

    public static double listAvg(List<Integer> list){
        return list.stream().mapToInt(Integer::intValue).average().getAsDouble();
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3);

        System.out.println(listAvg(numbers));
    }
}
