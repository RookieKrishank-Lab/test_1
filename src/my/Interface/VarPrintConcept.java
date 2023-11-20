package my.Interface;

interface first{
    static void m1(){
        System.out.println("a");
    }
}
interface sec extends first{
    default void m1(){
        System.out.println("b");
    }
}

class third implements sec {}

class VarPrintConcept {
    public static void main(String[] args) {
        new third().m1();
    }
}