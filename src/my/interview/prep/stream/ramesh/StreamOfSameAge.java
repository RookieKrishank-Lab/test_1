package my.interview.prep.stream.ramesh;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamOfSameAge {

    public static Map<Integer,List<Student>> sameAgeStreamMethod(List<Student> students){

        return students.stream().collect(Collectors.groupingBy(Student::getAge));

//                .filter((student1,student2) -> student1.getAge()equals(student2)).collect()

    }

    public static void main(String[] args) {

        Student student1 = new Student("Ram", 2);
        Student student2 = new Student("Xavi", 1);
        Student student3 = new Student("Puyol", 2);
        Student student4 = new Student("Ramos", 1);
        Student student5 = new Student("Hazard", 2);

        List<Student> studentList = Arrays.asList(student1,student2,student3,student4,student5);
//        System.out.println(sameAgeStreamMethod(studentList));
        sameAgeStreamMethod(studentList).forEach((key, value)->{
            System.out.println("Age: "+key);
            System.out.println("List of Student: "+value);
        });

    }

}


class Student{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}