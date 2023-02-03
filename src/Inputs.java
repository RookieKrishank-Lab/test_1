import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter your name ");
        String name = input.nextLine();
        System.out.println("Your name is " + name);
        System.out.print("Enter your roll no: ");
        int rollNo= input.nextInt();
        System.out.println("Your roll no is " +rollNo);
    }
}
