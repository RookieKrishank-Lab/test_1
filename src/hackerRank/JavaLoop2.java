package hackerRank;

import java.util.*;
import java.io.*;
import java.lang.Math;

public class JavaLoop2 {

        public static void main(String []argh){
            Scanner in = new Scanner(System.in);

            //Number of output line
            int t=in.nextInt();
            int a=0,b=0,n =0;
            a = in.nextInt();
            b = in.nextInt();
            n = in.nextInt();
            in.close();
            for(int d=0;d<t;d++){
//                a = in.nextInt();
//                b = in.nextInt();
//                n = in.nextInt();

                int[] arraysum = new int[n];

                for(int i=0;i<n;i++){
                    int sumb = a;
                    for(int j = 0 ; j<=i ; j++){
                        sumb = sumb + (int)(Math.pow(2,j))*b;
                        arraysum[i]=sumb;
                    }
                    System.out.print(arraysum[i]+" ");
                }
                System.out.println();
            }
//            in.close();
        }
}



        /*
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int a=0,b=0,n =0;
        for(int d=0;d<t;d++){
            a = in.nextInt();
            b = in.nextInt();
            n = in.nextInt();

            ArrayList<Integer> arraysum = new ArrayList<>();
            n = n*n;
        for(int i=1;i<n;i=i+2){
            int sumb = b;
            for(int j = 2 ; j<=i ; j = j+2){
                    sumb = sumb + j*b;
            }
            arraysum.add(sumb+a);
        }
        System.out.println(arraysum);
        }
        in.close();

        */


