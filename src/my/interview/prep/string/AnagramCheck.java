package my.interview.prep.string;

import java.util.Arrays;
import java.util.HashMap;

public class AnagramCheck {

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
    /*public static boolean checkUsingHashMap(String s1, String s2) {

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
        String str1 = "act";
        String str2 = "TAC";

        if(checkUsingCharArray(str1,str2)){
            System.out.println("True");
        }
        else{
            System.out.println("false");
        }
    }
}
