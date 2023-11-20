package my.relationship;

public class hasA {
}

//class TestClass extends Test1{
class TestClass {

    public static void main(String[] args) {
        TestClass testClass = new TestClass();
//		testClass.method4();
        Test1 test1 = new Test1();                  //Here TestClass is less heavy as compare to earlier cause now we are not inheriting
        test1.method3();
    }
    public void method1() {
        System.out.println("hello");
    }
    public void method2() {
        System.out.println("hello000000");
    }
}

class Test1{
    public void method3() {
        System.out.println("1hello");
    }
    public void method4() {
        System.out.println("1hello000000");
    }

}
