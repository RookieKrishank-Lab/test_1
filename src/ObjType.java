public class ObjType {
    public static void main(String[] args) {
    System.out.println(Test1.a);
    Test1 test1 = new Test1();

        System.out.println(test1.b+"     "+ test1.a+"  "+ test1.c);
    }
}

 class  Test1{
    static int a=50;
    int b=100;
    int c =b;
}