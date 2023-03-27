package com;

public class Man {
    String GetName(String name){
        return name;
    }
}
class MethodCallTest {

    public static void main(String[] args) {
        Man man = new Man();
        System.out.println(man.GetName("AJay"));
    }
}
