package basics.account;

import java.util.Arrays;

//  Method takes an integer array and a number. Method find the occurrence of that number, remove them from the list and return the array new length
public class RemoveElementArray {

    public static int removeElement(int[] nums, int val){

        if(nums.length==0){
            return nums.length;
        }

        if(nums.length==1){
            if(nums[0] == val){
                return 0;
            }
            else{
                return 1;
            }
        }
        int count=0;
        for(int i =0; i<nums.length; i++){
            if(nums[i]==val){
                count++;
            }
        }
        return nums.length-count;
        // int[] arr_new = new int[nums.length-count];
        // for(int i =0,k=0; i <nums.length; i++){

        //     if(nums[i]==val){
        //         // nums[i]= nums[i+1];
        //         continue;
        //     }

        //     arr_new[k++] = nums[i];

        // }
        // return arr_new.length;
    }


    public static void main(String[] args) {
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int val1 = 1;
        int newLength1 = removeElement(nums1, val1);
        System.out.println("Test case 1: Modified array: " + Arrays.toString(nums1) + "\nNew length: " + newLength1);

        int[] nums2 = {1, 2, 3, 4, 5, 6};
        int val2 = 6;
        int newLength2 = removeElement(nums2, val2);
        System.out.println("Test case 2: Modified array: " + Arrays.toString(nums2) + "\nNew length: " + newLength2);

        int[] nums3 = {-1, -2, -3, -4, -5};
        int val3 = -1;
        int newLength3 = removeElement(nums3, val3);
        System.out.println("Test case 3: Modified array: " + Arrays.toString(nums3) + "\nNew length: " + newLength3);

        int[] nums4 = {};
        int val4 = 1;
        int newLength4 = removeElement(nums4, val4);
        System.out.println("Test case 4: Modified array: " + Arrays.toString(nums4) + "\nNew length: " + newLength4);

        int[] nums5 = {1, 1, 1, 1, 1};
        int val5 = 1;
        int newLength5 = removeElement(nums5, val5);
        System.out.println("Test case 5: Modified array: " + Arrays.toString(nums5) + "\nNew length: " + newLength5);

        /*
            EXPECTED OUTPUT:
            ----------------
            Test case 1: Modified array: [-2, -3, 4, -1, 2, -5, 4, -5, 4]
            New length: 7
            Test case 2: Modified array: [1, 2, 3, 4, 5, 6]
            New length: 5
            Test case 3: Modified array: [-2, -3, -4, -5, -5]
            New length: 4
            Test case 4: Modified array: []
            New length: 0
            Test case 5: Modified array: [1, 1, 1, 1, 1]
            New length: 0
        */

    }
}
