package Collection;

import java.util.Stack;

public class Stack_1 {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();

        animals.push("Lion");
        animals.push("Dog");
        animals.push("cat");

        System.out.println("Stack of animals have: "+animals);

        System.out.println("Animal at the top: "+animals.peek());

        System.out.println(animals.pop());

        System.out.println("New Stack of animals after pop: "+animals);
    }

}
