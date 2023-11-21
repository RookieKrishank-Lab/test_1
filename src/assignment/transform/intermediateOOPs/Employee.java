package assignment.transform.intermediateOOPs;

public class Employee {
    private double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public double totalSalary(){
        return salary;
    }
}

class Manager extends Employee{
    private double incentive;

    public Manager(double salary, double incentive) {
        super(salary);
        this.incentive = incentive;
    }

    @Override
    public double totalSalary() {
        double totalSalary= super.totalSalary()+incentive;
        return totalSalary;
    }
}
class Labour extends Employee{
    private double overtime;

    public Labour(double salary, double overtime) {
        super(salary);
        this.overtime = overtime;
    }

    @Override
    public double totalSalary() {
        double totalSalary= super.totalSalary()+overtime;
        return totalSalary;
    }
}

class Main{
    public static void main(String[] args) {
        Employee emp1 = new Manager(1000,200);
        Employee emp2 = new Manager(1000,500);

        System.out.println(emp1.totalSalary());
        System.out.println(emp2.totalSalary());
    }
}
