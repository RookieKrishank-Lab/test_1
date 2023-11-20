package my.OOPs;

class Student_1{
    String Name;
    int roll;
    int age;

    //Default constructor
    Student_1(){
        this.Name= "San_1";
        this.roll= 87;
        this.age=1;
    }

    Student_1(int number){
        this.roll=number;
        this.age=number;
    }
    //Constructor overloading. this keyword will be replace by obj like s_1
    Student_1(String Name, int roll, int age){
        this.Name= Name;
        this.roll= roll;
        this.age=age;
    }

    //copy constructor
    Student_1(Student_1 other){
        Name= other.Name;
        this.roll= other.roll;
        this.age=other.age;
    }

    /*
    OOPs.my.Student_1(){
        //this is how u call a constructor from another constructor
        //internally->new OOPs.my.Student_1("Random name",62,2);
        this("Random name",62,2);
    }

     */

    void greeting(){
        System.out.println("Hello my name is "+this.Name);
    }

    void changeName(String NewName){
        this.Name=NewName;
    }
}

public class OOP_1 {
    public static void main(String[] args) {
        Student_1 s_1 = new Student_1();
        Student_1 s_2 = new Student_1("Vijay",23,91);
        Student_1 random = new Student_1(s_1);
        Student_1 s_3 = new Student_1(233);

        System.out.println(s_3.age+" "+s_3.roll);

        System.out.println(random.Name);

        Student_1 random_2= new Student_1();
        System.out.println(random_2.Name);

        System.out.println(s_1.Name);
        System.out.println(s_1.roll);
        System.out.println(s_1.age);

        System.out.println(s_2.Name);
        System.out.println(s_2.roll);
        System.out.println(s_2.age);
/*
        s_1.changeName("Assam BOY");
        s_1.greeting();
*/
    }
}
