import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {


        //type casting
        int numb = (int)(231.31f);
        System.out.println(numb);

        int number = 'a';
        System.out.println(number);
/*
        //automatic type casting
        int a = 257;
        // byte can store 256 bit max
        byte b = (byte)(a);         //257>256 so 257 % 256 =1
        System.out.println(b);      // output =1

        byte a = 40;
        byte b = 50;
        byte c = 100;
        int d = a*b/c;
        System.out.println(d);

        // a*b = 2000>256 that is greater than the max limit of byte but still it is showing output because in java if we do byte evaluation java is doing automatically casting the output to integer

        byte b =2;
        b= b*50;        // b=100 now but b is byte so we cant assign byte to integer
        b= (byte)(b*50);

        int number = 'A';
        System.out.println(number);


        String str_1= "ab";
        String str_2= "cd";
        String str_3= str_1+str_2;
        System.out.println(str_3.getClass());                       //class java.lang.String
        System.out.println(str_3.getClass().getSimpleName());       //String
        System.out.println(str_3.getClass().getName());             //java.lang.String

        char ch_1 = 'a';
        char ch_2 = 'b';
//        System.out.println(ch_1+" "+ch_2.getClass());

         */
    }
}
