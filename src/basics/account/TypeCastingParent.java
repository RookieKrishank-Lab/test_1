package basics.account;

public class TypeCastingParent {

    String name;

    void method1(){
        System.out.println("Parent class method 1");
    }

    void method2(){
        System.out.println("Parent class method 2");
    }
}

class TypeCastingParentChild extends TypeCastingParent {
    int id;

    void method1(){
        System.out.println("Child class method 1");
    }

    void method3(){
        System.out.println("Child class method 2");
    }
}
class Main{
    public static void main(String args[]){

        //  Upcasting
        TypeCastingParent parent = new TypeCastingParentChild();
/*
        parent.name = "Parent";
        System.out.println("My name is " +parent.name);
        parent.method1();
        parent.method2();
//        parent.method3();                  //  Not possible cause we can only access parent class method
//        parent.id= "Child";
        */

        //  Downcasting
        TypeCastingParentChild child = (TypeCastingParentChild)parent;
        child.name = "Child";
        child.method1();
        child.method2();
        child.method3();
        System.out.println("My name is: "+child.name+ " and my id is: "+child.id);

    }
}
