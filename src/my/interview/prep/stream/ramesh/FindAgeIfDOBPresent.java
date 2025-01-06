package my.interview.prep.stream.ramesh;

import javax.naming.BinaryRefAddr;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

//Java 8 Program to Find the Age of a Person if the Birthday Date has Given
public class FindAgeIfDOBPresent {

    public static void main(String[] args) {

    //as we may not have DOB and we are taking DOB through user input so we are putting Scanner inside try block ie try-with resources
    try(Scanner scanner = new Scanner(System.in)){
        System.out.println("Enter you age in YYYY-MM-DD format: ");
        String birthDateString = scanner.nextLine();

        LocalDate birthDate = LocalDate.parse(birthDateString);

        LocalDate currentDate = LocalDate.now();

        Period age = Period.between(birthDate, currentDate);

        System.out.println("You are "+age.getYears()+" years old!");

    }

    }
}
