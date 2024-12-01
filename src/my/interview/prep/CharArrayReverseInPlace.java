package my.interview.prep;

import java.util.Arrays;

public class CharArrayReverseInPlace {

    public static char[] Reverse(char[] s){

        for(int i=0; i<(s.length)/2;i++){
            char temp;
            temp = s[i];
            s[i] = s[s.length - (i+1)];
            s[s.length - (i+1)] = temp;
        }
        return s;
    }

    public static void main(String[] args) {
        char[] chars = {'h','e','l','l','o'};

        System.out.println(Reverse(chars));
    }
}
