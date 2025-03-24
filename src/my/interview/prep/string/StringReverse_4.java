package my.interview.prep.string;

//toCharArray
public class StringReverse_4 {

    public static void main(String[] args) {

        String myString = "hello";
        char[] myChars = myString.toCharArray();
        /*
        //using a new string
        String newString = "";
        for(char c : myChars){
            newString = c + newString;
        }
        System.out.println("My new string after reversing "+newString);
        */

        //directly printing the array elements
        for(int i=myChars.length-1; i>=0; i--){
            System.out.print(myChars[i]);
        }


    }
}
