package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Stream_1_Intro {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(null,5,2,8,3);

       /* Stream<Integer> data = l1.stream();
        Stream<Integer> mappedData = data.map(n->n*2);

        mappedData.forEach(n-> System.out.println(n));
        data.forEach(n-> System.out.println(n));*/

        /*
        //inside filter if we want we can use object of predicate instead of lamda exp
        Predicate<Integer> predicate = (Integer number) -> number%2!=0;
         */

        Optional<Integer> result = l1.stream()
                .sorted()
//                .filter(n->n%2!=0)                      //.filter(predicate)
//                .map(n->n*2)
//                .forEach(a -> System.out.println(a));

                //to calculate the sum of values output by map method
                .reduce( (c,e)-> c+e);                            //c = ouput of previous operation, e = new element

        System.out.println(result.get());
    }

}
