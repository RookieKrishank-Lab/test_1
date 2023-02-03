package com.Interface;

@FunctionalInterface
public interface FuntionalLamdaCombo {
    public void operation(int a, int b);
}

/*
class child implements FuntionalLamdaCombo{

    @Override
    public void operation(int a, int b){
        System.out.println("The output of the operation is "+(a+b));
    }
}

class Execution{
    public static void main(String[] args) {
        FuntionalLamdaCombo n1 = new child();
        n1.operation(2,3);
    }
}
 */

class Execution{
    public static void main(String[] args){
        FuntionalLamdaCombo n1 = (a,b) -> System.out.println("The output of the operation is "+(a+b));
        n1.operation(2,3);
        FuntionalLamdaCombo n2 = (a,b) -> System.out.println("The output of the operation is "+(a*b));
        n2.operation(2,3);
        FuntionalLamdaCombo n3 = (a,b) -> System.out.println("The output of the operation is "+(a-b));
        n3.operation(2,3);

    }
}