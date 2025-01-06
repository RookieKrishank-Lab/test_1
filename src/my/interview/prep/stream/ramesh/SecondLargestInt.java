package my.interview.prep.stream.ramesh;

import java.util.Arrays;
import java.util.List;

public class SecondLargestInt {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3,4,5,12,4,12);

        /* time complexity is nlogn
        List<Integer> sortedNumbers = numbers.stream().sorted().toList();

        System.out.println("Sorted List is: "+sortedNumbers);

        for(int i =0; i<sortedNumbers.size();i++){
            if(i==sortedNumbers.size()-2) {
                System.out.println(sortedNumbers.get(i));
            }
        }*/

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int  num : numbers){
            if (num>largest){
                secondLargest= largest;
                largest = num;
            } else if (num>secondLargest && num<largest) {
                //(num > secondLargest): Ensures that the current number is a candidate for being the second-largest number. means it is less than largest so the current number is eligible number for second largest number
                //(num < largest): Ensures that the current number is not equal to or larger than the largest number, as we want the second largest number.
                secondLargest=num;

            }
        }

        System.out.println("2nd largest number: "+secondLargest);

    }
}
