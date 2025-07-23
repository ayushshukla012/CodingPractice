package TUF_Blind75Sheet;

/*
We are given an array Arr[] of length n. It represents the price of a stock on ‘n’ days. The following guidelines need to be followed:

We can buy and sell a stock only once.
We can buy and sell the stock on any day but to sell the stock, we need to first buy it on the same or any previous day.
We need to tell the maximum profit one can get by buying and selling this stock.
 */
public class BuyAndSellStock {
    public static void main(String[] args) {
        int[] arr = {7,2,5,3,6,1,4};
        int maxProfit =0,minimumPrice=arr[0];
        for(int i=1;i<arr.length;i++){
            int todaysProfit = arr[i] - minimumPrice;
            maxProfit = Math.max(maxProfit, todaysProfit);
            minimumPrice = Math.min(arr[i], minimumPrice);
        }
        System.out.println(" Max Profit: " + maxProfit);
    }
}
