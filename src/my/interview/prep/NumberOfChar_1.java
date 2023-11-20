package my.interview.prep;

import java.util.Scanner;

public class NumberOfChar_1 {
    private static int recursiveCountOccurrences(String str, char ch, int ind) {
        if (ind == str.length())
            return 0;
        int cnt = 0;
        if (str.charAt(ind) == ch)
            cnt++;
        return cnt + recursiveCountOccurrences(str, ch, ind + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string you want to reverse: ");
        String originalString = sc.nextLine();
        int cnt = recursiveCountOccurrences(originalString, 'o', 0);
        System.out.println("Occurrences: " + cnt);
    }
}
