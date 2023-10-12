package com.exception;

/*
    throws keyword doesnt handle exception it just delegate the exception handling to the caller.
    Here doMoreStuff is raisng and IE so to handle the exception we have delegate the handling to JVM by adding throws to main method
    To delegate to main we need to add throws IE at each and very method which directly or indirectly call doMoreStuff
*/
public class Throws1 {
    public static void main(String args[]) throws InterruptedException{
        doStuff();
    }

    public static void doStuff() throws InterruptedException{
        doMoreStuff();
    }
    public static void doMoreStuff() throws InterruptedException {
        Thread.sleep(10000);
    }
}
