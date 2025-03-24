package my.interview.prep.array;

public class ArrayRotation {
//    [3,1,0,5,0,0,4,2]
//    [1,2,3,4,5,0,0,0]


    public static boolean rotateString(String s, String goal) {
        if (s.equals(goal)){
            return true;
        }
        int n = s.length();
        char[] nums = s.toCharArray();
        String str1 ="";
        int counter = 0;

        while (!goal.equals(str1) ) {

            counter++;
            if(counter==n){
                return false;
            }

            str1 = "";
            char[] temp = new char[n];
            System.arraycopy(nums, n - 1, temp, 0, 1);
            System.arraycopy(nums, 0, nums, 1, n - 1);
            System.arraycopy(temp, 0, nums, 0, 1);

            str1=String.copyValueOf(nums);
        }
            return true;

    }

    public static void main(String[] args) {
        System.out.println(rotateString("abcde","cdeab"));
    }
}
