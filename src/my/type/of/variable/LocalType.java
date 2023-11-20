package my.type.of.variable;

public class LocalType {

    public static void main(String[] args) {

        /*boolean a= true;
        if(a==true){
            System.out.println(a);
        }
        else{
            System.out.println(a);
        }*/
    }

    boolean m1(boolean var){

        if(var==true){
            int a=0;
            System.out.println(var);
        }
        else{
            System.out.println(var);
//            System.out.println(a);          //CE: java: cannot find symbol
        }
        return var;
    }
}
