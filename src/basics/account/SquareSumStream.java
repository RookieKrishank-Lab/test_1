package basics.account;

import java.util.List;

//  Square of each element in the list and then sum of all the square numbers
public class SquareSumStream {
    public static void main(String[] args) {
        List<Integer> sq = List.of(2,3,4,5);

        sq.stream().map(e->e*e).forEach(System.out::println);
        System.out.println("------------");

        int n = sq.stream().map(e->e*e).reduce(0,(x,y)->x+y);
        System.out.println(n);
    }
}
