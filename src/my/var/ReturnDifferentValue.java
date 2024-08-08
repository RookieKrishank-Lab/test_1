package my.var;

public class ReturnDifferentValue {

    int x =1;
    int m1(){
        int x = 10;
        return x;
    }
    /*int m2(){
        int x = 100;
        return x;
    }*/
    void m2(){
        int x = 100;
        System.out.println(x);
    }
    void m3(){
        System.out.println(x);
    }
    public static void main(String[] args) {

        ReturnDifferentValue obj = new ReturnDifferentValue();
        System.out.println(obj.x);
        System.out.println(obj.m1());
//        System.out.println(obj.m2());
        obj.m2();
        obj.m3();
    }
}
