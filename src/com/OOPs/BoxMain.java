package com.OOPs;

public class BoxMain {
    public static void main(String[] args) {

//        Box b_old = new Box(1,2,4);
//        Box b_old_new = new Box(b_old);
//        System.out.println(b_old_new.b);

//        Box b_default_obj= new Box();
//        System.out.println(b_default_obj.b);
        /*
        Box b_1 = new BoxWeight(2,3,4,3);
        //As our refernce var is from parent class and parent dont know anything about child class var weight. So it will give error. But if we print l,b,h it will give the default value
        System.out.println(b_1.weight);
         */

        /*
        we can acess the weigth from BoxWeight but it has to be initialize but Box contructor dont know wht is weight so it give a error
        BoxWeight b_2= new Box(2,3,4);
        System.out.println(box_2);
         */
//        BoxWeight b_3 = new BoxWeight();
//        System.out.println(b_3.b);

        Box b_4 = new BoxWeight(2,3,4);
        System.out.println(b_4.b);

        b_4.getL();         //datahiding

        Box b_5 = new BoxWeight();
        b_5.greeting();             // static method cant be override but can be inherited

    }
}
