package cn.magicgone.learning.leetcode.problem121;

public class Solution {
    public int maxProfit(int[] prices) {
        // 倒过来循环数组，找到最大值，同时计算如果当天买入，最大值卖出，能赚多少
        int maxPrice = 0;
        int maxProfit = 0;
        for (int i = prices.length - 1; i >= 0; i--) {
            int price = prices[i];
            if (price > maxPrice) {
                maxPrice = price;
            }

            int profit = maxPrice - price;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }
}