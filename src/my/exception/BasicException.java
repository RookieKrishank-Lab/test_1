package my.exception;

// ArithmeticException is the child class and Exception is the parent class

public class BasicException {
    public static void main(String[] args) {
        int a = 12;
        int b = 6;
    try{                            //inside try write that part which might give an exception
        System.out.println(divide(a,b));
    }
    catch(ArithmeticException e){                          //inside catch write what will happen if we get an exception in try block
        System.out.println(e.getMessage());
        }
    catch(Exception e){                          // more strict exception should be written first like ArithmeticException then Exception
        System.out.println("Normal Exception");
    }
    finally {
        System.out.println("this block will always execute");
    }
    }

    static float divide(int a, int b) throws ArithmeticException{             //throws to declare an exception
        if(b==0){
            throw new ArithmeticException("Do not divide by 0");        //throw keyword to create manual exception
        }
        return a/b;
    }
}