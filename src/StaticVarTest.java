public class StaticVarTest {

//    int counter;
    static int counter;

    /*
    static var value can be change but if we mention final static then only we cant change
     */
    StaticVarTest(){
        counter++;
        System.out.println("Current Value of the Counter is: " + counter);

    }
}

class StaticTest {
    public static void main(String[] args) {

        StaticVarTest t1= new StaticVarTest();
        StaticVarTest t2= new StaticVarTest();
        StaticVarTest t3= new StaticVarTest();
    }

}
