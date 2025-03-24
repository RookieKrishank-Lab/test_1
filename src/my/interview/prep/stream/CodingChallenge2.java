package my.interview.prep.stream;
/*
Let's go back to Julia and Kate's study about dogs. This time, they want to convert dog ages to human ages and calculate the average age of the dogs in their study.

Create a function 'calcAverageHumanAge', which accepts an arrays of dog's ages ('ages'), and does the following things in order:

1. Calculate the dog age in human years using the following formula: if the dog is <= 2 years old, humanAge = 2 * dogAge. If the dog is > 2 years old, humanAge = 16 + dogAge * 4.
2. Exclude all dogs that are less than 18 human years old (which is the same as keeping dogs that are at least 18 years old)
3. Calculate the average human age of all adult dogs (you should already know from other challenges how we calculate averages 😉)
4. Run the function for both test datasets

TEST DATA 1: [5, 2, 4, 1, 15, 8, 3]
TEST DATA 2: [16, 6, 10, 5, 6, 1, 4]

*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodingChallenge2 {

    public static void calcAverageHumanAge(List<Integer> ages){

        List<Integer> moreThan2Age = ages.stream().filter(age -> age > 2).map(age -> age = 16 + age * 4).toList();
        List<Integer> lessThan2Age = ages.stream().filter(age -> age <= 2).map(age -> age = 2 * age).toList();

        List<Integer> updatedAges = new ArrayList<>();

        for(int age : ages){
            if(age > 2){
                updatedAges.add(16 + age * 4);
            }else{
                updatedAges.add(2 * age);
            }
        }
        System.out.println("Human years are: "+updatedAges);

        /*List<Integer> ageListMoreThan18 = ages.stream().filter(age -> age>18).map( age -> age = 16 + age *4 ).toList();
        if(ageListMoreThan18.size()!=0) {
            System.out.println("The age of Dog greater than 18: " + ageListMoreThan18 + " and average age of them " + ageListMoreThan18.stream().mapToInt(Integer::intValue).average());
        }
        List<Integer> ageListLessThan18 = ages.stream().filter(age -> age<18).map( age -> age = 2 * age ).toList();
        System.out.println("The age of Dog greater than 18: "+ageListLessThan18);*/

        List<Integer> ageListMoreThan18 = updatedAges.stream().filter(age -> age>18).toList();
        if(ageListMoreThan18.size()!=0) {
            System.out.println("The age of Dog greater than 18: " + ageListMoreThan18 + " and average age of them " + ageListMoreThan18.stream().mapToInt(Integer::intValue).average().getAsDouble());
        }else{
            System.out.println("No Dog age is more than 18");
        }
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 2, 4, 1, 15, 8, 3);
        //[16, 6, 10, 5, 6, 1, 4]

        calcAverageHumanAge(list);
    }

}
