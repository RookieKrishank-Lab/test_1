public class Array_1 {
    public static void main(String[] args) {
    int[] x;
    x = new int[10];
    x[9]=9;

    for(int x1 :x){             //instead of int we can write Integer
        System.out.print(x1);
    }
    System.out.println();

    int []y;
    int z[];

    int abc_1[] = {2,3};
    int abc_2[] = new int[]{2,3};

    //int[2] a ;                    // will give error cause at the time of "declaration" we cant assign size but at the time of "creation" we need to assign size
    int[] a = new int[2];
    int[][] b = new int[2][];       //1st array size is 2 and remaining array b[0][0] and b[1][0] is different
    int[][] c= new int[2][1];       //1st array 2 size and 2nd array 1 size

    /*
    int[] X= new int[3];

        System.out.println(X);
        System.out.println(X[0]);

     int[][] x_1 = new int[2][3];
        System.out.println(x_1);
        System.out.println(x_1[0]);
        System.out.println(x_1[0][0]);

        int[][] x_1 = new int[2][];
        System.out.println(x_1);
        System.out.println(x_1[0]);
        System.out.println(x_1[0][0]);

    int[] x_1 = new int[2];//{{1,2},{3,4}};         // **NEVER define the array size and the array element at the same time
        x_1[0]=2;
        x_1[1]=2;
        //x_1[2]=3;
        System.out.println(x_1[0]+" "+x_1[0]+" ");
     */
     // Not the right way of assigning var value in 2D array
        int[][] x_1 = new int[2][];
        //x_1[0] = 2;

        //proper way
        x_1[0] = new int[2];

        //for assigning value to the array pos
        x_1[0][0]= 23;
        System.out.println(x_1[0][0]);

    }
}
