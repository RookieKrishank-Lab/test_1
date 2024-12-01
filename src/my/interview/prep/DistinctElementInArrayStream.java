package my.interview.prep;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctElementInArrayStream {

//    public static List<Integer> list(){
    public static int[] list(){
        int nums[] = {1,5,4,2,9,9,9};
//        int nums[] = {3,5,3,4};
        return Arrays.stream(nums)
                .distinct()
//                .boxed()
//                .collect(Collectors.toList());
                .toArray();
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(list()));
    }
}
