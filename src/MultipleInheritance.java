public class MultipleInheritance extends CDE implements ABC, BCD{

    @Override                   //Without the annotation it is also working?
    public int m1() {
        return 0;
    }

    public static void main(String[] args) {

    }
}

interface ABC{
 int m1();
}
interface BCD{
    int m1();
}
class CDE{
 void m2(){
     System.out.println("td");
 }
}
class DEF{
}

/*
interface X implements DEF extends BCD{
}
 */

