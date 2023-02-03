package com.Interface;

public interface interfaceTest {

    public void hello();

    public void greeting();
}

abstract class a implements interfaceTest{

    @Override
    public void hello(){
        System.out.println("Hello method");
    }
}

class b extends a{

    @Override
    public void greeting(){
        System.out.println("Greeting method");
    }
}