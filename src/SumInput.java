import java.util.Scanner;

public class SumInput {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int numb_1 = number.nextInt();
        int numb_2 = number.nextInt();

        int sum  = numb_1 + numb_2;
        System.out.println("Sum = " +sum);
    }
}
