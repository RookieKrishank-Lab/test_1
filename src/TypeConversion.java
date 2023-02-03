import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Float numb= input.nextFloat();
        System.out.println(numb);
        System.out.println(" data type value is " + numb.getClass().getSimpleName());   //((Object)numb) if we define numb as float not Float
    }
}
