package basics.account;

public class InstanceStaticVar {

    static int x =10;
    int y = 20;

    public static void main(String[] args) {
    InstanceStaticVar t1 = new InstanceStaticVar();
    x = 88;                         // as x is static var and we are using that var inside the declare class itself so we can use x directly
    t1.y = 99;

    InstanceStaticVar t2 = new InstanceStaticVar();
    System.out.println("X = " + t2.x + ", " + "Y = " + t2.y);
    }
}
