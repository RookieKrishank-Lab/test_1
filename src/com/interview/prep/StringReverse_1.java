package com.interview.prep;

import java.util.Scanner;

//Using for loop for forward iteration
public class StringReverse_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string you want to reverse: ");
        String originalString = sc.nextLine();
        //System.out.println(originalString);
        char characters;
        String reverseString = "";                                      //If we dont initialize an empty string we will get error while concatine with the characters
        for(int i=0; i<originalString.length(); i++){
            characters = originalString.charAt(i);
            reverseString = characters + reverseString;
        }
        System.out.println("The reverse string: "+ reverseString);
    }

}
