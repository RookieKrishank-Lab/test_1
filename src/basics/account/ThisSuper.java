package basics.account;

//  Usage of this and super keyword
class Parent{
    String str = "Hello";
}

class Child extends Parent{
    String str = "hi";

    public void m1(){
        System.out.println(str);
        System.out.println(this.str);
        System.out.println(super.str);
    }
}
public class ThisSuper {
    public static void main(String[] args) {
        Child object1 = new Child();
        object1.m1();
    }
}