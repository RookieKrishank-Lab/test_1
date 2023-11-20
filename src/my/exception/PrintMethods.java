package my.exception;
/*
Various ways to print exception message
*/
public class PrintMethods {
    public static void main(String args[]){
        try{
            System.out.println(10/0);
        }
        catch (ArithmeticException message){
//            message.printStackTrace();
//            System.out.println(message);  //|| System.out.println(message.toString());
            System.out.println(message.getMessage());
        }
    }
}
