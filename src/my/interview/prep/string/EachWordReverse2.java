package my.interview.prep.string;

import java.util.Arrays;

public class EachWordReverse2 {

    public static void main(String[] args) {
        String myString = "hello java";
        String[] myWords = myString.split(" ");
        System.out.println(Arrays.toString(myWords));
    }
}
