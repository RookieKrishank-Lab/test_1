package basics.account;

import java.util.Arrays;

//  k will tell the number of time we need to rotate the array
public class RotateArray {

    public static void rotate(int[] nums, int k){
    /*
    //Wrong approach
    for(int i =0;i<k % nums.length; i++){

        int temp = nums[i];
        nums[i] = nums[((nums.length)-1)-i];
        nums[((nums.length)-1)-i] = temp;
    */
        /*
        //Tanmoy approach
        k = k % nums.length;
        int temp[] = new int[k];

        //store the 2nd part in a temporaryarray
        for(int i =0; i<k; i++){
            temp[i] = nums[nums.length-k+i];
        }

        //store the 1st half in the 2nd part of the array
        for(int i = nums.length-1; i >=k; i--){
            nums[i]=nums[i-k];
        }

        //store the temporaryarray value in the first part of the main array
        for(int i=0; i<k;i++){
            nums[i] = temp[i];
        }*/

        int n = nums.length;
        k = k % n; // Handle cases where k is greater than the array length

        // Create a temporary array to store the rotated values
        int[] temp = new int[n];

        // Copy the last k elements to temp
        System.arraycopy(nums, n - k, temp, 0, k);

        // Shift the remaining elements to the right
        System.arraycopy(nums, 0, nums, k, n - k);

        // Copy the elements from temp back to nums
        System.arraycopy(temp, 0, nums, 0, k);

    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;
        rotate(nums1, k1);
        System.out.println("Test case 1: Rotated array: " + Arrays.toString(nums1));  // prints "Rotated array: [5, 6, 7, 1, 2, 3, 4]"

        int[] nums2 = {-1, -100, 3, 99};
        int k2 = 2;
        rotate(nums2, k2);
        System.out.println("Test case 2: Rotated array: " + Arrays.toString(nums2));  // prints "Rotated array: [3, 99, -1, -100]"

        int[] nums3 = {1, 2};
        int k3 = 3;
        rotate(nums3, k3);
        System.out.println("Test case 3: Rotated array: " + Arrays.toString(nums3));  // prints "Rotated array: [2, 1]"

        int[] nums4 = {1};
        int k4 = 0;
        rotate(nums4, k4);
        System.out.println("Test case 4: Rotated array: " + Arrays.toString(nums4));  // prints "Rotated array: [1]"

        int[] nums5 = {1, 2, 3, 4, 5, 6};
        int k5 = 6;
        rotate(nums5, k5);
        System.out.println("Test case 5: Rotated array: " + Arrays.toString(nums5));  // prints "Rotated array: [1, 2, 3, 4, 5, 6]"

        /*
            EXPECTED OUTPUT:
            ----------------
            Test case 1: Rotated array: [5, 6, 7, 1, 2, 3, 4]
            Test case 2: Rotated array: [3, 99, -1, -100]
            Test case 3: Rotated array: [2, 1]
            Test case 4: Rotated array: [1]
            Test case 5: Rotated array: [1, 2, 3, 4, 5, 6]
        */

    }

}
