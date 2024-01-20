package com.wemaxsoft.algorithm;

public class Best_Time_to_Buy_and_Sell_Stock_II {

	/*
	 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/564/
	 */
	public static void main(String[] args) {
		Best_Time_to_Buy_and_Sell_Stock_II test = new Best_Time_to_Buy_and_Sell_Stock_II();
		
		int[] prices = new int[] {7,1,5,3,6,4};
		int profit = test.maxProfit(prices);
		
		System.out.println(profit);
	}
	
	public int maxProfit(int[] prices) {
        int profit = 0;
        
        for (int i=0; i<prices.length-1; i++) {
        	if (prices[i] < prices[i+1]){
                profit += prices[i+1] - prices[i];
            }
        }
        
        return profit;
    }
}
