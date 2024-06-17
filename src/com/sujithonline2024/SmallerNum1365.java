/*
 * Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

Return the answer in an array.

 

Example 1:

Input: nums = [8,1,2,2,3]
Output: [4,0,1,1,3]
Explanation: 
For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3). 
For nums[1]=1 does not exist any smaller number than it.
For nums[2]=2 there exist one smaller number than it (1). 
For nums[3]=2 there exist one smaller number than it (1). 
For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
Example 2:

Input: nums = [6,5,4,8]
Output: [2,1,0,3]
Example 3:

Input: nums = [7,7,7,7]
Output: [0,0,0,0]
 
 * 
 * */
package com.sujithonline2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SmallerNum1365 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {8,1,2,2,3}; //[2,1,0,3] 4,5,6,8 
		int[] res = smallerNumbersThanCurrent(nums);
		printArray(res);

	}
	
	 public static int[] smallerNumbersThanCurrent(int[] nums) {
	        int[] res = new int[nums.length];

	        List<Integer> intList = new ArrayList<Integer>(nums.length);
	        for (int i : nums)
	        {
	            intList.add(i);
	        }
	        Collections.sort(intList);
	        int size = intList.size();
	        int j=0;
	        for(int n : nums) {
	        	int index = intList.indexOf(n);
	        	res[j] =  index  ;
	        	j++;
	        }
	        return res;
	    }
	 
	 public int[] smallerNumbersThanCurrentUsingMaps(int[] nums) {
	        
	        Map<Integer, Integer> map = new HashMap<>();
	        int[] copy = nums.clone();
	        
	        Arrays.sort(copy);
	        
	        for (int i = 0; i < nums.length; i++) {
	            map.putIfAbsent(copy[i], i);
	        }
	        
	        for (int i = 0; i < nums.length; i++) {
	            copy[i] = map.get(nums[i]);
	        }
	        
	        return copy;
	    }

	 private static void printArray(int[] a) {
		 
			for(int r : a)
				System.out.println(" "+r);
	 }
}
