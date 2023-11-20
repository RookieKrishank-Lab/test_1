package my.OOPs;

public class Human {
    int age;
    String name;
    static long population;//=5;

    Human(int age, String name){
        this.age =age;
        this.name = name;
        Human.population +=1;
    }
}

class Main{
    public static void main(String[] args){
        Human h_1 = new Human(23,"Vijay");
        Human h_2 = new Human(41, "Kiran");

        System.out.println(Human.population);
        System.out.println(Human.population);
    }
}