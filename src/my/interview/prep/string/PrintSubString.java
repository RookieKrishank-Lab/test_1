package my.interview.prep.string;

import java.util.ArrayList;
import java.util.List;

public class PrintSubString {
    public static List<String> printStr(String str){
        // char[] ch = str.toCharArray();
        List<String> strList = new ArrayList<>();
        for(int i =0; i< str.length()-1; i++){
            System.out.println(str.substring(i,i+2));           //i + 2 equals 5, which is the length of the string, so it works correctly.
//            strList.add();
        }
        return strList;
    }
    public static void main(String[] args) {
        String str = "abcde";
//        System.out.println(printStr(str));
        printStr(str);
    }
}
