public class InstanceVar {

    int instVar =10;

    public static void main(String[] args) {
        /*
        System.out.println(instVar);
        This will give an error as instance var is part of obj, cant execute without an obj but static main can execute without an obj
         */
        InstanceVar var_1= new InstanceVar();
        System.out.println(var_1.instVar);
    }

    //Instance method
    public void m1(){               //this method will always be called on the obj only
         System.out.println(instVar);
    }

}
