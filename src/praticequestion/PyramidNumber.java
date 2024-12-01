package praticequestion;

public class PyramidNumber {
    public static void main(String[] args) {
//        int arr[] = {1,2,3};
        int n =5;
        // Arrays.stream(arr).forEach(a->System.out.println(a));
//        for(int i=0; i<arr.length; i++){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i;j++){
//                System.out.print(arr[j]);
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}
