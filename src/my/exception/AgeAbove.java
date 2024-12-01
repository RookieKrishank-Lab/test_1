package my.exception;

import java.util.Scanner;

public class AgeAbove {

    //error and throws,try & catch is checked(compile time) others all in uncheck exception(Runtime).
    //Custom exception extends Runtime, but they should be handled and thrown by the user as compiler is not aware of it.
    //Here our custom method is not extending checked exception so we dont need to write try-catch or throws with it.
    public void isAge(int age){ //throws BelowAgeException {
        if (age<15) {
            throw new BelowAgeException("Age is less than 15");
            //System.out.println("");           //unreachable statement
        } else {
            System.out.println("Age is: " + age);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the age (Should be greater than 15): ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        AgeAbove a = new AgeAbove();
        if (a!=null){
            System.out.println("Hii");
        }
        a.isAge(age);
        /*try{
            a.isAge(age);
        }
        catch (BelowAgeException ex){
            System.out.println(1);
            ex.printStackTrace();
        }

        catch (Exception ex){
            System.out.println(2);
            ex.printStackTrace();
        }*/

    }
}
class BelowAgeException extends RuntimeException {
    public BelowAgeException(String str) {
        super(str);
    }
}
