package com.Enum;

enum Beer{
    KF(213), Bira(23), Rio(72), Brocode;
    int price;
    Beer(int price){
        this.price=price;
    }
    Beer(){
        this.price=150;
    }

    public int getPrice(){
        return price;
    }
}
public class enumConstructor {
    public static void main(String[] args){
        Beer[] b = Beer.values();                   //storing all the enum constant in array b
        for(Beer b1:b){                             //for every Beer obj b1 in b
            System.out.println(b1+" "+b1.getPrice());
        }
    }
}
