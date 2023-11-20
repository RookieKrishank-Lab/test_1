package my.LamdaPractice;

/*
    if the lamda expression body contain only one statement then no need of {}
    if {} is not use then return keyword is not required just use a+b or whatever expression u want
    Lambda expression provides implementation of functional interface.
 */

interface Operation {
    int operation(int a, int b);
}

public class LambdaFunctions {
    public static void main(String[] args) {
//        ArrayList<Integer> arr = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            arr.add(i + 1);
//        }
////        arr.forEach((item) -> System.out.println(item * 2));
//
//        Consumer<Integer> fun = (item) -> System.out.println(item * 2);         //fun is the obj name of Consumer
        //Consumer means the funtion will consume the passed values, perform the required operation and wont return any value



//        arr.forEach(fun);
//
        //sum, prod, sub is the obj of LamdaPractice.my.Operation

        Operation sum = Integer::sum;   // Integer::sum;
        Operation prod = (a, b) -> a * b;
        Operation sub = (a, b) -> a - b;
//
//        LamdaPractice.my.LambdaFunctions myCalculator = new LamdaPractice.my.LambdaFunctions();
//        System.out.println(myCalculator.operate(5, 3, sum));
//        System.out.println(myCalculator.operate(5, 3, prod));
//        System.out.println(myCalculator.operate(5, 3, sub));
//    }
//
        //calling the operator method(lamda function)
//    private int operate(int a, int b, LamdaPractice.my.Operation op) {
//        return op.operation(a, b);

        System.out.println(sum.operation(2,3));
    }
    int abc(int a, int b){
        return a+b;
    }
}

