package my.interview.prep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LastElementChange {

    public static void main(String[] args) {

        String str = "I love banana";

        //to get the space between the words
        char[] newStr = str.toCharArray();

        //Create an array where each element of an array will be the words in the string. by doing this we can change the last element
        List<String> arrayList = new ArrayList<>();
        //this string will be array elements
        String str2 ="";
        for (int i =0; i< newStr.length;i++) {
            str2+= newStr[i];
            //once we get space in our char array we will add the space with the previous word and by using trim we will remove the space
            if (newStr[i] == ' ' || i==newStr.length-1) {
                arrayList.add(str2.trim());
                str2="";
            }
        }
        System.out.println(arrayList);

        //c is a list where we will have all the words of our string except the last word
        List<String> c = arrayList.stream().limit(arrayList.size() - 1).collect(Collectors.toList());

        //new word
        Scanner scanner = new Scanner(System.in);
        //to remove spaces from the user input word (i have used for loop previously)
        String lastElement = scanner.nextLine().trim();

        //to capitalize the 1st letter of the third word (i have used for loop previously)
        String answer = lastElement.substring(0,1).toUpperCase() + lastElement.substring(1);

        //now we will add the last element to the list
        c.add(answer);

        System.out.println(c);

        //to convert the arrayList to string
        String s2= c.stream().collect(Collectors.joining(" "));

        System.out.println(s2);
    }
}
