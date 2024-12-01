package my.interview.prep.string;

    import java.util.ArrayList;
    import java.util.List;

public class LexicographicSmallestLargest {
    public static String getSmallestAndLargest(String s, int k) {

        List<String> strList = new ArrayList<>();
        for(int i =0; i< s.length()-k; i++){
            strList.add(s.substring(i,i+k));
        }



        String smallest = strList.get(0);
        String largest = strList.get(0);

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for(int i=1; i< strList.size() ; i++){

            String current = strList.get(i);

//            if(strList.get(i).compareTo(strList.get(i+1)) == 1){
//                smallest = current;
//            }
//            else{
//                smallest = strList.get(i);
//            }
            if (current.compareTo(smallest) < 0) {
                smallest = current;
            }

            if (current.compareTo(largest) > 0) {
                largest = current;
            }
        }
        return smallest + "\n" + largest;
/*
        List<String> strList = new ArrayList<>();
        for(int i =0; i< s.length()-2; i++){
            strList.add(s.substring(i,i+k));
        }



        String smallest = strList.get(0);
        String largest = strList.get(0);

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for(int i=0; i< strList.size()-2 ; i++){
            if(strList.get(i).compareTo(strList.get(i+1)) == 1){
                largest = strList.get(i);
            }
            else{
                smallest = strList.get(i);
            }
        }
        return smallest + "\n" + largest;
*/

    }



    public static void main(String[] args) {
    String str = "welcometojava";
        System.out.println(getSmallestAndLargest(str,3));

    }


}
