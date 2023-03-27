package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_2 {
        public static void main(String[] args){
                Scanner in = new Scanner(System.in);

                System.out.println("Enter the number of rows");
                int rows = in.nextInt();
                System.out.println("Enter the number of cols");
                int cols = in.nextInt();

                int[][] arr = new int[rows][cols];

                //input
                for(int row = 0; row< arr.length; row++){
                        for(int col=0; col<arr[row].length; col++){
                                arr[row][col] = in.nextInt();
                        }
                }

                //output
//                for(int row = 0; row< arr.length; row++){
//                        for(int col=0; col<arr[row].length; col++){
//                                System.out.println(arr[row][col]);
//                        }
//                }

                //Another way to print
                for(int row=0; row< arr.length; row++){
                        System.out.println(Arrays.toString(arr[row]));
                }
        }
}
