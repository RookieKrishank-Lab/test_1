package my.stringbuffer;


public class Buffer3{

    public static void m1(String s){
        System.out.println("string");
    }

    public static void m1(Object o){
        System.out.println("object");
    }
    public static void main(String []args){
        StringBuffer sb=new StringBuffer("Hello");
        sb.delete(1,3);
        System.out.println(sb);

        m1(sb);
    }


}

