package praticequestion;

//Iterative Fibonacci series program in Java

public class FibonacciNormal {

    public static void main(String args[])
    {
//Considering the first two numbers as 0 and 1
        int num1=0,num2=1,num3,i,count=10;
//Count=10 means that only the first 10 fibonacci numbers will be displayed
        System.out.print(num1+" "+num2);
//printing 0 and 1
        for(i=2;i<count;++i)
//looping is initiated from 2 as 0 and 1 are already printed
        {
            num3=num1+num2;
            System.out.print(" "+num3);
            num1=num2;
            num2=num3;
        }
    }
}


/*
Analysis for Fibonacci series in Java program :
        Time Complexity: O(N)
        Auxiliary Space: O(1)
        */

    /*
    static void Fibonacci(int N)
    {
        int num1 = 0, num2 = 1;

        int counter = 0;

        // Iterate till counter is N
        while (counter < N) {

            // Print the number
            System.out.print(num1 + " ");

            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }

    // Driver Code
    public static void main(String args[])
    {
        // Given Number N
        int N = 10;

        // Function Call
        Fibonacci(N);
    }*/
