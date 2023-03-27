package com.OOPs;

public class Box {

    private int l;
    int b;
    int h;

    //Default constructor
    Box(){
        this.l=-1;
        this.b=-1;
        this.h=-1;
//        super();      //if we only use super then it will call Object class and give default value of that data type but if we dont use super still they give the default value
    }

    Box(int oneNmber){
        this.l=1;
        this.b=2;
        this.h=1;
    }

    Box(Box old){
        this.l= old.l;
        this.b= old.b;
        this.h=old.h;
    }

    public Box(int l, int b, int h) {   //Parametrize constructor - It is used to provide different values to distinct objects.
        this.l = l;
        this.b = b;
        this.h = h;
    }

    public int getL() {
        return l;
    }

    static void greeting(){
        System.out.println("Hey im in box class");
    }
}

class BoxWeight extends Box{
    int weight;

    public BoxWeight(){
        this.weight=-1;
    }

    public BoxWeight(int l, int b, int h, int weight) {
//        super(l, b, h);             //this is the way to initialize the parent class value from your child class. ie super call parent class constructor
        //if we dont use super it will use the default contructor in BOx class
        this.weight = weight;
    }

    public BoxWeight(int l, int b, int h){
        super(l,b,h);
    }

    static void greeting(){
        System.out.println("Hey im in boxweight class");
    }
}