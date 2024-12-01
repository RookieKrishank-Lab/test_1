package my.interview.prep.array.window.prob;

import java.util.*;

public class FirstNegativeNumberInWindow {

    /*public static int[] findNegative(int[] numbers, int k){
        int i=0, j=0;
        while(j<= numbers.length-k){
            int firstNegative =0;
            if(numbers[j]<0){
                firstNegative = numbers[j];
                j++;
                break;
            }
            else {
                j++;
            }
        }

    }*/
    public static void main(String[] args) {

//        System.out.print("inter array size n > ");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int[] arr = new int[n];
//        System.out.println("enter arr values > ");
//        for(int i=0;i<n;i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        System.out.print("inter window size k > ");
//        int k = sc.nextInt();

        int[] arr = {12,-1,-7,8,-15,30,16,28};
        int k =3;

        Queue<Integer> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();

        int i = 0, j = 0;

        while(j < arr.length) {

            if(arr[j] < 0)
                queue.add(arr[j]);

            if((j - i + 1) < k) {
                j++;
            }
            else if((j - i + 1) == k) {
                if(queue.isEmpty()) {
                    list.add(0);
                }
                else {
                    list.add(queue.peek());
                    System.out.println(queue.peek());
                    if(arr[i] == queue.peek())
                        queue.poll();
                }
                i++;
                j++;
            }

        }

        System.out.println(list);

    }

}
