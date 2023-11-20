package my.interview.prep;

import java.util.Scanner;

//Using StringBuilder
public class StringReverse_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string you want top reverse: ");
        String originalString = sc.nextLine();
        StringBuilder reverseString=new StringBuilder(originalString);
        reverseString.reverse();
        System.out.println("Reverse string is: "+reverseString);
    }
}
