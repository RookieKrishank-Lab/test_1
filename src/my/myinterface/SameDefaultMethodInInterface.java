package my.myinterface;

interface A{
    default public void play(){
        System.out.println("Inside interface A");
    }
}

interface B{
    default public void play(){
        System.out.println("Inside interface B");
    }
}

public class SameDefaultMethodInInterface implements A,B{
//    @Override
    public void play() {
        A.super.play();
    }

    public static void main(String[] args) {
        SameDefaultMethodInInterface obj = new SameDefaultMethodInInterface();
        obj.play();

        B obj2 = new SameDefaultMethodInInterface();
        obj2.play();
    }
}
