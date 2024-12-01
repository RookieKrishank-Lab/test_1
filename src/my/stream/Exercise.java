package my.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise {

    /*private static String comman(char[] chars){
        String lastElement = "";
        for (char a : chars){
            if(a!=' ') {
                lastElement += a;
            }
        }
        return lastElement;
    }
*/
    public static void main(String[] args) {

        String str = "I love banana";
        char[] newStr = str.toCharArray();

        List<String> arrayList = new ArrayList<>();
        String str2 ="";
//        ArrayList arr = Arrays.asList(str)
        for (int i =0; i< newStr.length;i++) {
            str2+= newStr[i];
            if (newStr[i] == ' ' || newStr.length-1==i) {
                arrayList.add(str2.trim());
                str2="";
            }

        }
//        String lastString = arrayList.get(arrayList.size()-1);
////        char[] chars = lastString.toCharArray();
//        lastString = "Apple";
//        System.out.println(lastString);

//arrayList.set(arrayList.size()-1,"Apple");
//        for(int i= 0; i< arrayList.size()-1;i++){
//            if (i == arrayList.size()-1) {
//                arrayList[i] = "Apple";
//            }
//        }
        System.out.println(arrayList);

        Scanner scanner = new Scanner(System.in);
        List<String> c = arrayList.stream().limit(arrayList.size() - 1).collect(Collectors.toList());
        //char[] chars = scanner.nextLine().toCharArray();

//        System.out.println(chars);
//        chars[0] = Character.toUpperCase(chars[0]);
//        System.out.println(chars[0]);

//        lastElement.trim();
//        for (char a : chars){
//            if(a!=' ') {
//                lastElement += a;
//            }
//        }
        String lastElement = scanner.nextLine().trim();
        //char[] chars2 = lastElement.toCharArray();
        //chars2[0] = Character.toUpperCase(chars2[0]);
        //String lastElement2="";
       // for (char c2 : chars2){
       //     lastElement2+=c2;
       // }
        String answer = lastElement.substring(0,1).toUpperCase() + lastElement.substring(1);
//        System.out.println(lastElement2);
//        chars[0] = Character.toUpperCase(chars[0]);
//        c.add(scanner.nextLine());
        c.add(answer);
//        c.add("Apple");
        System.out.println(c);

        String s2= c.stream().collect(Collectors.joining(" "));

        System.out.println(s2);
    }
}
