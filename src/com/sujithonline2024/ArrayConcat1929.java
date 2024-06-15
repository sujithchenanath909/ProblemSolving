/*
 * Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Specifically, ans is the concatenation of two nums arrays.

Return the array ans.

 

Example 1:

Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]
Example 2:

Input: nums = [1,3,2,1]
Output: [1,3,2,1,1,3,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
- ans = [1,3,2,1,1,3,2,1]
 
 * 
 * */
package com.sujithonline2024;

public class ArrayConcat1929 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,3,1};
		getConcatenation(arr);
		int[] arr2 = {1,3,2,1,3,4,5};
		getConcatenation(arr2);

	}
	
	 public static int[] getConcatenation(int[] nums) {
	        int[] res = new int[nums.length*2];
	        
	        for(int i=0 ;i< nums.length ;i++) {
	        	
	        	res[i] = nums[i] ;
	        	res[i+nums.length] = nums[i];
	        }
	        printArray(res);
	        return res;
	    }
	 
	 public static void printArray(int [] arr) { 
		 for(int  a : arr) {
			 System.out.print(a+",");
		 }
	 }

}
