package my.interview.prep.string;

import java.util.HashMap;
import java.util.Map;

public class CharOccurrenceInString {

    public static void main(String[] args) {
        String input = "hello world";
        Map<Character, Integer> charCount = new HashMap<>();

        for (char ch : input.toCharArray()) {
//            if (!Character.isWhitespace(ch)) { // Optional: Ignore whitespaces count
                charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
//            }
        }

        charCount.forEach((character, count) ->
                System.out.println(character + ": " + count));
    }
}
