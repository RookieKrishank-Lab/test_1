package com.Enum;

enum Week{
    Monday,Tuesday,Wednesday,Thursday, Friday, Saturday, Sunday;
    /*
    these all are constant
    public static final, since final no child class
    type is of Week
     */
//    Week(){
//        System.out.println("Constructor call for "+this);
    /*
    this is not public nor protected, only private and default
    why?    enum is not use for creating new obj(if u want use class instead) rather it is use to store N number of constant
    internally: public static final Week = new Week();
     */
//    }
}
public class enumMethods {
    public static void main(String[] args){
        Week week = Week.Tuesday;

        for(Week days:Week.values()){
            System.out.println("Day is "+days);
        }

        System.out.println(week.ordinal());
    }
}
