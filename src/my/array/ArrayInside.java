package my.array;

public class ArrayInside {

    public static void main(String[] args) {
        // Create the first array of length 15
        int[] firstArray = new int[15];

        // Initialize the first array with some values
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = i;
        }

        // Create the second array of length 5
        int[][] secondArray = new int[5][3];

        // Assign references to subarrays of the first array to the second array
        for (int i = 0; i < secondArray.length; i++) {
            if (i < 5) {
                // Each element of the second array points to a subarray of length 3 in the first array
                secondArray[i] = new int[]{firstArray[i * 3], firstArray[i * 3 + 1], firstArray[i * 3 + 2]};
            }
        }

        // Print the contents of the second array
        for (int i = 0; i < secondArray.length; i++) {
            System.out.print("Second Array Element " + i + ": ");
            for (int j = 0; j < secondArray[i].length; j++) {
                System.out.print(secondArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
