package com.wemaxsoft.algorithm;

public class BestTimeToBuyAndSellStock2 {

	/*
	 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/564/
	 */
	public static void main(String[] args) {
		BestTimeToBuyAndSellStock2 test = new BestTimeToBuyAndSellStock2();
		
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
