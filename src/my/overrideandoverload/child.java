package my.overrideandoverload;

class parent{
    public static void method1()
    {
        System.out.println("Method-1 of the parent class is executed.");
    }
    public void method2()
    {
        System.out.println("Method-2 of the parent class is executed.");
    }
}
public class child extends parent{

    public static void method1(){
        System.out.println("Metbod-1 of child class is running");
    }
    public void method2(){
        System.out.println("Method-2 of child class is running");
    }

    public static void main(String args[]){
        parent obj1 = new parent();
        parent obj2 = new child();

        obj1.method1();
        obj1.method2();

        obj2.method1();
        obj2.method2();
    }

}

