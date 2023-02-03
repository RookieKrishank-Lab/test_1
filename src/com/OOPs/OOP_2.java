package com.OOPs;
class A{
    String name;

    public A(String name) {
        this.name = name;
    }
}
public class OOP_2 {
    public static void main(String[] args) {
        final A a_1 = new A("Krishank");
        a_1.name = "other name";
    }
}
