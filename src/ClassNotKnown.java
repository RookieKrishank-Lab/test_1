class Student{

}

class Name{

}
public class ClassNotKnown{
    public static void main(String[] args) throws Exception{


        Object obj =  Class.forName(args[0]).newInstance();      //Class.getDeclaredConstructor().newInstance();

        System.out.println("Object created for: " + obj.getClass().getSimpleName());
    }

}
