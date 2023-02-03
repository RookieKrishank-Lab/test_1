public class StaticVar {

    static int x= 10;

    public static void main(String[] args) {
        StaticVar x_1 = new StaticVar();

        //way of printing static var
        System.out.println(x_1.x =11);      // not recommended as static is not related to obj
        System.out.println(StaticVar.x);
        System.out.println(x);
    }
}
