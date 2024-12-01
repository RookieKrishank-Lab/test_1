package my.interview.prep.array.window.prob;

public class MaxSumWindowSizeGiven {

    public static long maximumSubarraySum(int[] nums, int k) {

        if (nums.length < k || k==0) {
            return 0;
        }

//        nums = Arrays.stream(nums)
//                .distinct()
//                .toArray();

        int sum = 0, i=0, j =0;
        long maxSum=0;

        while(j< nums.length){

            sum += nums[j];

            //            if(j - i + 1 < k){
//                j++;
//            } else
            if (j - i + 1 == k){
                maxSum = Math.max(sum,maxSum);
                sum = sum -nums[i];
                i++;
//                j++;
            }
            j++;
        }
        return maxSum;
    }

    public static void main(String[] args){
//        int nums[] = {1,5,4,2,9,9,9};
        int nums[] = {3,5,3,4};
        System.out.println(maximumSubarraySum(nums,3));
    }
}
