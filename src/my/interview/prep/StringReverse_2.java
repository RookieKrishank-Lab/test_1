package my.interview.prep;

import java.util.Scanner;

//Using for loop for backward iteration
public class StringReverse_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string you want to reverse: ");
        String originalString = sc.nextLine();
        //System.out.println(originalString);
        char characters;
        String reverseString = "";                                      //If we dont initialize an empty string we will get error while concatine with the characters
        for (int i = originalString.length() - 1; i >= 0; i--) {
            characters = originalString.charAt(i);
            reverseString = reverseString + characters;
        }
        System.out.println("The reverse string: " + reverseString);
    }
}
