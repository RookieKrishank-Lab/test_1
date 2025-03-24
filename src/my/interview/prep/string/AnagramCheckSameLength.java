package my.interview.prep.string;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheckSameLength {

    public static boolean charFrequency(String str1, String str2){

        if(str1.length() != str2.length()){
            return false;
        }
        int[] charCount = new int[256];

        for(int i=0; i <str1.length(); i++){
            charCount[str1.charAt(i)]++;
            charCount[str2.charAt(i)]--;
        }

        for(int count : charCount){
            if(count != 0){
                return  false;
            }
        }

        return true;
    }
    /*
    //using char array
    public static boolean checkUsingCharArray(String a, String b){
        if (a.length()!=b.length()){
            return false;
        }
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);

    }

    //using HashMap
    public static boolean checkUsingHashMap(String s1, String s2) {

        // If lengths are different, they cannot be anagrams
        if (s1.length() != s2.length()) {
            return false;
        }

        // Create a hashmap to store character frequencies
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Count frequency of each character in the first string
        for (char c : s1.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
    }*/

    public static void main(String[] args) {
        /*String str1 = "act";
        String str2 = "TAC";

        if(checkUsingCharArray(str1,str2)){
            System.out.println("True");
        }
        else{
            System.out.println("false");
        }*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st string");
        String str1 = scanner.nextLine();

        System.out.println("Enter 2nd string");
        String str2 = scanner.nextLine();

        boolean result = charFrequency(str1,str2);

        if(result){
            System.out.println("Strings are anagram");
        }else {
            System.out.println("String not anagram");
        }
        scanner.close();
    }
}
