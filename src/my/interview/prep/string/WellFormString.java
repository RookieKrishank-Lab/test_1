package my.interview.prep.string;

import java.util.Stack;

public class WellFormString {

    public static String completeStringCheck(String str){

        char[] chars = str.toCharArray();

        if(chars.length%2 != 0){
            return "String length not even";
        }

        Stack<Character> stack = new Stack<>();
        for(char ch : chars){
            // Opening bracket logic
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // Closing bracket logic
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty() || !isMatchingPair(stack.peek(),ch)) {
                    return "Incomplete string";
                }
                stack.pop();
            }
        }

        if (stack.empty()){
            return "Complete string";
        }else{
            return "Incomplete string";
        }
    }

    // Helper method to check if the characters are matching brackets
    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        String str = "))";
        System.out.println(completeStringCheck(str));

    }
}
