package my.accessModifier;

class Parent{
    protected void myfunction(){
        System.out.println("Parent string");
    }
}

public class ProtectedTest extends Parent {

    @Override
    protected void myfunction() {
        System.out.println("Child string");
    }

    public static void main(String[] args) {
        Parent obj = new ProtectedTest();
        obj.myfunction();
    }
}


