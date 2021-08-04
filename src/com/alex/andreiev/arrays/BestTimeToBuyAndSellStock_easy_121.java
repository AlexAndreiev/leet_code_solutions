package com.alex.andreiev.arrays;

/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy ONE stock and
    choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Constrains:
    1 <= prices.length <= 105
    0 <= prices[i] <= 104
*/

public class BestTimeToBuyAndSellStock_easy_121 {

    public int maxProfit(int[] prices) {
/*
    Time complexity: O(n).
    Space complexity: O(1).
*/
        if (prices == null)
            return 0;

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice)
                minPrice = prices[i];
            else if (prices[i] - minPrice > maxProfit)
                maxProfit = prices[i] - minPrice;
        }
        return maxProfit;
    }
}
