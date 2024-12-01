package my.interview.prep;

public class CharArrayReverseExternalMemory {

    static String strReversal(char[] str){

        String a = "";

        for(int i=str.length-1;i>=0;i--){
            a = a+str[i];
        }
        return a;

    }

    public static void main(String[] args) {
        char[] arr = {'a','p','p','l','e'};
        System.out.println(strReversal(arr));
    }
}
