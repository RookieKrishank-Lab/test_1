package my.contructor;

public class ThisConstructorUse {
        private String name;
        private int age;
        private String course;

        // Constructor 1: No arguments, default values
        public ThisConstructorUse() {
            this("Unknown", 18); // Calls Constructor 2
            System.out.println("Default constructor called");
        }

        // Constructor 2: Two arguments
        public ThisConstructorUse(String name, int age) {
            this(name, age, "Undeclared"); // Calls Constructor 3
            System.out.println("Two-argument constructor called");
        }

        // Constructor 3: Three arguments
        public ThisConstructorUse(String name, int age, String course) {
            this.name = name;
            this.age = age;
            this.course = course;
            System.out.println("Three-argument constructor called");
        }

        public void displayInfo() {
            System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
        }

        public static void main(String[] args) {
//            ThisConstructorUse ThisConstructorUse1 = new ThisConstructorUse(); // Calls the no-arg constructor
//            ThisConstructorUse1.displayInfo();

//            ThisConstructorUse ThisConstructorUse2 = new ThisConstructorUse("John", 20); // Calls the two-arg constructor
//            ThisConstructorUse2.displayInfo();

            ThisConstructorUse ThisConstructorUse3 = new ThisConstructorUse("Alice", 22, "Computer Science"); // Calls the three-arg constructor
            ThisConstructorUse3.displayInfo();

    }

}
