/*
 *You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
 

Constraints:

1 <= prices.length <= 105
0 <= prices[i] <= 104 
 * */
package com.sujithonline2024;

public class BuySellStocks121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {7,1,5,3,6,4};
		int[] prices2 = {7,6,4,3,1};
		System.out.println(maxProfit2Optimized(prices));
		System.out.println(maxProfit2Optimized(prices2));
		
	}
	public static int maxProfit(int[] prices) {
		int maxProfit=0;
		int n = prices.length;
		
		for(int i=0;i<n;i++) {
			for(int j=i+1 ;j<n;j++) {
				if(prices[i] < prices[j]) {	
				int	profit = prices[j] - prices[i];
				if(profit>maxProfit)
					maxProfit=profit;
				}
			}
		}
		
		return maxProfit;
    }
	
	public static int maxProfit2Optimized(int[] prices) {
		int buy = prices[0];
		int maxProfit = 0;
		for(int i=1 ; i<prices.length ;i++) {
			
			if(prices[i] < buy) {
				buy = prices[i];
			}else if(prices[i] - buy > maxProfit) {
				
				maxProfit = prices[i] - buy;
				
			}
			
		}
		
		
		return maxProfit;
		
		
	}
}
