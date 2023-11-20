package my.method;

public class ReturnVsPrint {
    public static void main(String[] args) {
        exampleMethod(5);
    }

    public static void exampleMethod(int value) {
        if (value > 0) {
            System.out.println("Value is positive");
        } else {
            System.out.println("Value is non-positive");
        }

        // Code after the if block
        System.out.println("Method continues to execute...");
    }

    public static String stop(int value){
        if(value == 0){
            return "The value is "+value;
        }
        else
            return "The value is not found";

        /*
        //  Unreachable print statement
        System.out.println("hiii");
        */
    }
}
