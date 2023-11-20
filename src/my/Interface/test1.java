package my.Interface;

public class test1 {
}

class sec1 {}

//class sec1 extends test1{}                    //allowed

//class sec1 implements sec1{}                    //Not allowed

interface a1{

    public int method1();
}

//interface a1 implements sec1{}                //interface cant implement class

//interface a1 extends sec1{}                   //interface cant extends class

class a4 implements a1{
    @Override
    public int method1() {
        return 0;
    }
}                        //class can implements interface

//class a5 extends a1{}                           //class cant extends interface

interface a2{

    static void m1(){}

    default void m2(){}

//    void m3();          //by default if we dont define the access modifier for method it will be abstract

//    private void m4(){}
}

interface B1 {

    static int m8(){
        return 2;
    }
}

interface A1 extends B1,a2 {
    public static void main(String[] args) {
        System.out.println("hi");
    }
}                   // allowed


//interface A1 implements B1 {}                   // not allowed because interface might not provide implementation of abstract method

