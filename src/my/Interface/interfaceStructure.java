package my.Interface;

public interface interfaceStructure {
    void m1();
}

interface interfaceStructure1 extends interfaceStructure{

    static int m2(int a, int b){
        return a+b;
    }
}
class display implements interfaceStructure1{

    @Override
    public void m1() {
        System.out.println("From child im running");
    }
    public static void main(String[] args) {
//        interfaceStructure1 inter1 = new display();
//        inter1.m1();
//        System.out.println(inter1.m2(8,9));

        display d1= new display();
        d1.m1();
        System.out.println(interfaceStructure1.m2(8,9));        //if we define m2 as default then we can write d1.m2(8,9) here

    }
}
