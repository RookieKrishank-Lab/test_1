package my.interview.prep.array;

import java.util.ArrayList;

public class FirstNegativeNumberInWindowBrute {

    /*public static ArrayList<Integer> findNegative(int[] numbers, int k){
        int min =0;
        int minMain =0;
        ArrayList<Integer> newNegativeNumbers = new ArrayList<>(); //[numbers.length-k+1];
        for(int i=0; i<=numbers.length-k;i++){
            for (int j=i; j<=i+2; j++){
                min = numbers[j];
                minMain = Math.min(min, minMain);
                if(minMain<0)   break;
            }
            newNegativeNumbers.add(minMain);
            minMain =0;
        }
//        return minMain;
        return newNegativeNumbers;
    }

    public static void main(String[] args){
        int[] numbers ={12,-1,-7,8,-15,30,16,28};
        System.out.println(findNegative(numbers,3));
    }

    public static int[] findNegative(int[] numbers, int k) {
//        ArrayList<Integer> newNegativeNumbers = new ArrayList<>();
        int[] newNegativeNumbers = new int[numbers.length-k+1];

        // Loop through the array with a window size 'k'
        for (int i = 0; i <= numbers.length - k; i++) {
            int firstNegative = 0;  // Reset for each window

            // Loop through each window to find the first negative number
            for (int j = i; j < i + k; j++) {
                if (numbers[j] < 0) {
                    firstNegative = numbers[j]; // Assign negative number
                    break;  // Break as soon as we find the first negative number
                }
            }

            // Add the first negative number or 0 if none found
//            newNegativeNumbers.add(firstNegative);
            newNegativeNumbers[i]= firstNegative;
        }

        return newNegativeNumbers;
    }

    public static void main(String[] args) {
        int[] numbers = {12, -1, -7, 8, -15, 30, 16, 28};
        System.out.println(Arrays.toString(findNegative(numbers, 3)));
    }*/

    public static ArrayList<Integer> findNegative(int[] numbers, int k) {
        ArrayList<Integer> newNegativeNumbers = new ArrayList<>();
        int firstNegative = 0;  // Cache the first negative from previous window

        for (int i = 0; i <= numbers.length - k; i++) {
            // If the last negative number is still within the current window, no need to search again
            // for the 1st time it wont run
            // we will only enter if condition if we have found any -ve number before so that we can check if the same number
            if (firstNegative < 0 && numbers[i] == firstNegative) {
                // Same negative number still in the window
                newNegativeNumbers.add(firstNegative);
                continue;
            }

            // Otherwise, search for a new negative number in the current window.
            //we have not found any -ve number in the previous window then we will come
            // we found -ve number in the previous but that was the last element of the window so now we are checking the new number that is just now added in the window
            firstNegative = 0;
            for (int j = i; j < i + k; j++) {
                if (numbers[j] < 0) {
                    firstNegative = numbers[j];
                    break;
                }
            }

            newNegativeNumbers.add(firstNegative);
        }

        return newNegativeNumbers;
    }

    public static void main(String[] args) {
        int[] numbers = {12, 1, 1, 1,-1, -2, -7, 8, -15, 30, 16, 28};
        System.out.println(findNegative(numbers, 3));
    }
}
