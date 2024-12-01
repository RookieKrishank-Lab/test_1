package my.interview.prep.string;

import java.util.ArrayList;
import java.util.List;

public class SubString {

    public static List<String> printStr(String str){
        // char[] ch = str.toCharArray();
        List<String> strList = new ArrayList<>();
        for(int i =0; i< str.length()-1; i++){
            strList.add(str.substring(i,i+2));
        }
        return strList;
    }
    public static void main(String[] args) {
        String str = "abcde";
        System.out.println(printStr(str));
    }

}
