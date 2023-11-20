package my.Interface;

@FunctionalInterface
public interface FuntionalInterfaceEg{
    void m1();
}

//if the interface contain only one abstrct method then it is by default funtional interface only whether we are defining the annotation or not

@FunctionalInterface
interface B extends FuntionalInterfaceEg{
//    void m2();                    //cant have more than 1 abstrct method in child of FuntionalInterface
    void m1();
}

interface C extends FuntionalInterfaceEg {
    void m2();
}