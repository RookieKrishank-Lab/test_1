package com.Generics.compareObj;

public class Student implements Comparable<Student>{            //Comparing every student class obj with every Student class obj. without compareable java wont understand which var we need to compare with
    int rollno;
    float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override                               //To print the marks before and after comparing with each other
    public String toString() {
        return marks + " ";// + rollno;
    }

    @Override                               //Interface Comparble have a method call compareTo where we define which var we need to compare with our obj
    public int compareTo(Student old) {
        System.out.println("in compareto method");
        int diff = (int)(this.marks - old.marks);

        // if diff == 0: means both are equal
        // if diff < 0: means o is bigger else o is smaller

        return diff;
    }


}
