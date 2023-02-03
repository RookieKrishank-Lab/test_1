package com;

public class ConstructorPlay {

    int rollNo;
    String Name, branch;
    float marks;

    public ConstructorPlay(int rollNo, String Name, String branch){
        this.rollNo = rollNo;
        this.Name = Name;
        this.branch = branch;
    }

    public ConstructorPlay(int rollNo, String Name, String branch, float marks){
        this(rollNo, Name, branch);
        this.marks=marks;
    }

    void display(){
        System.out.println("Roll No "+rollNo + ", Name " + Name +", Branch " + branch + ", Marks " + marks);
    }


    public static void main(String[] args){
        ConstructorPlay constructorPlay1 = new ConstructorPlay(2,"Rab", "CSE");
        ConstructorPlay constructorPlay2 = new ConstructorPlay(3,"Sam","IT",234);

        constructorPlay1.display();
        constructorPlay2.display();
    }
}
