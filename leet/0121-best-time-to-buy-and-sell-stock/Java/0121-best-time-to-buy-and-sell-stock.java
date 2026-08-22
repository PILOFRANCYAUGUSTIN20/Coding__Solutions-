class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0],profit,maxProfit=0;
        for(int day=1;day<prices.length;day++){
            if (prices[day] < buy) {
                buy = prices[day];
            } else {
                // Calculate profit if sold today and update maxProfit
                profit = prices[day] - buy;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }    
            }

        }
        return maxProfit;
    }
}