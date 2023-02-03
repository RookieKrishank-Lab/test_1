//Since Java 8, interface can have default and static methods

public interface InterfaceTest {

    void draw();
    default void msg(){
        System.out.println("default method");
    }
}

class Rectangle implements InterfaceTest{
    public void draw(){System.out.println("drawing rectangle");}
}

class TestInterfaceDefault {
    public static void main(String args[]) {
        InterfaceTest interfaceTest = new Rectangle();
        interfaceTest.draw();
        interfaceTest.msg();
    }
}