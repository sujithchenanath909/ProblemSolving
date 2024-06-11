/*
 * Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. 
You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 * 
 * 
 * */
package com.sujithonline2024;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement169 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {3,2,3};
     System.out.println(majorityElement(nums));
	}

	 public static int majorityElement(int[] nums) {
		 	int result=0;
		 	int n=nums.length / 2;
		 	Map<Integer,Integer> countMap= new HashMap<>();
		 	for(int num : nums) {
		 		if(countMap.containsKey(num))
		 			countMap.put(num, countMap.get(num)+1);
		 		else
		 			countMap.put(num,1);
		 	}
		 	System.out.println(countMap.toString());
		 	
		 	 for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
		         System.out.println(entry.getKey() + ":" + entry.getValue());
		         if(entry.getValue() > n)
		        	 result = entry.getKey();
		     }
		 	return result;
	    }
	 
	  public int majorityElementSpaceN(int[] nums) {
		    Integer ans = null;
		    int count = 0;

		    for (final int num : nums) {
		      if (count == 0)
		        ans = num;
		      count += num == ans ? 1 : -1;
		    }

		    return ans;
		  }
}
