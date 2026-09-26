// Problem: Best Time to Buy and Sell Stock II
// Platform: leetcode
// Rating/Difficulty: Medium
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
// Solved on: 2026-09-26T10:47:40.854Z

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                maxProfit=maxProfit+prices[i]-prices[i-1];
            }
        }
        return maxProfit;
    }
}