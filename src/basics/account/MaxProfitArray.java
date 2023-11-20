package basics.account;

//  Array of stock price, we need to find the max profit that we will get from selling the stock. As it is a daily data we cant sort the data
public class MaxProfitArray {

    public static int maxProfit(int[] prices){
/*
    O(n^2)
    int main_diff=0;

        for(int i =0; i<(prices.length)-1; i++){
            for(int j=i+1; j<prices.length; j++){
                if(prices[i]<prices[j]){
                    int new_diff;
                    new_diff= prices[j] - prices[i];
                    if(main_diff<new_diff){
                        main_diff = new_diff;
                    }
                }
            }
        }
        return main_diff;*/


        int min_price = 99999999, max_profit = 0;

        for(int price : prices){
            if(price < min_price)     min_price = price;

            int profit = price - min_price;

            if(max_profit < profit)     max_profit = profit;
        }
        return max_profit;
    }


    public static void main(String[] args) {

        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int profit1 = maxProfit(prices1);
        System.out.println("Test case 1: Maximum profit: " + profit1); // prints "Maximum profit: 5"

        int[] prices2 = {7, 6, 5, 4, 3, 2, 1};
        int profit2 = maxProfit(prices2);
        System.out.println("Test case 2: Maximum profit: " + profit2); // prints "Maximum profit: 0"

        int[] prices3 = {1, 2, 3, 4, 5, 6, 7};
        int profit3 = maxProfit(prices3);
        System.out.println("Test case 3: Maximum profit: " + profit3); // prints "Maximum profit: 6"

        int[] prices4 = {3, 2, 6, 5, 0, 3};
        int profit4 = maxProfit(prices4);
        System.out.println("Test case 4: Maximum profit: " + profit4); // prints "Maximum profit: 4"

        int[] prices5 = {2, 4, 1};
        int profit5 = maxProfit(prices5);
        System.out.println("Test case 5: Maximum profit: " + profit5); // prints "Maximum profit: 2"

        /*
            EXPECTED OUTPUT:
            ----------------
            Test case 1: Maximum profit: 5
            Test case 2: Maximum profit: 0
            Test case 3: Maximum profit: 6
            Test case 4: Maximum profit: 4
            Test case 5: Maximum profit: 2
        */

    }

}
