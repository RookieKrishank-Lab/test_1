package my.interview.prep;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Reverse each word of the string
public class EachWordReverse {

    public static void main(String[] args) {

        String str = "am bnb";

        //converting string to char array
        char[] newStr = str.toCharArray();

        //string array
        List<String> arrayList = new ArrayList<>();
        String str2 ="";
        for (int i =0; i< newStr.length;i++) {
            str2+= newStr[i];
            if (newStr[i] == ' ' || i==newStr.length-1) {
                arrayList.add(str2.trim());
                str2="";
            }
        }
        System.out.println("---"+arrayList);

        //reverse each element of an array
        String ans = "";
        for (String i : arrayList) {
            StringBuilder builder = new StringBuilder(i);
            ans = ans +" " + builder.reverse().toString();
        }
       System.out.println(ans.trim());
    }
}
