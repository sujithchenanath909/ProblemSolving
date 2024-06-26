/*
 * 70. Climbing Stairs
Easy
Topics
Companies
Hint
You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

 

Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
 

Constraints:

1 <= n <= 45

 * approach::
 * use a dp array to store number of ways to reach if n=0 and n=1 number of ways to reach is 1 .now if n=2
 * it would be 1+1=2 , if n=3 it would be 1+1+2=4 ...
 * */

package com.sujithonline2024;

public class ClimbingStairs70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(climbStairs(3));
		System.out.println(climbStairs(45));
	}
	
	public static int climbStairs(int n) {
		
		if(n==1 || n==0)
			return 1;
		int[] dp = new int[n+1];
		dp[0]=dp[1]=1;
		
		for(int i=2 ;i<=n;i++) {
		
			dp[i] = dp[i-1] + dp[i-2] ;
			
		}
		
		return dp[n];
        
    }

}
