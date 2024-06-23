/*
Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.

 

Example 1:

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
Example 2:

Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.
Example 3:

Input: nums = [1,2,3]
Output: 0

 */package com.sujithonline2024;

import java.util.HashMap;

public class GoodPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,1,1,3};
		int[] nums2 = {1,1,1,1};
		int[] nums3 = {1,2,3};
		System.out.println(numIdenticalPairs(nums));
		System.out.println(numIdenticalPairs(nums2));
		System.out.println(numIdenticalPairs(nums3));
		
		System.out.println(numIdenticalPairsUsingMaps(nums));
		System.out.println(numIdenticalPairsUsingMaps(nums2));
		System.out.println(numIdenticalPairsUsingMaps(nums3));
	}
	 public static int numIdenticalPairs(int[] nums) {
	        int res=0;
	        
	        for(int i=0;i<nums.length;i++) {
	        	
	        	for(int j= i+1 ;j<nums.length ;j++) {
	        		
	        		if(nums[i]==nums[j])
	        			res++;
	        	}
	        }
	        
	        return res;
	    }
	 
	    public static int numIdenticalPairsUsingMaps(int[] nums) {
	        HashMap<Integer, Integer> hm = new HashMap<>();
	        
	        int ans = 0;
	        
	        for(int num:nums)
	        {
	            int count = hm.getOrDefault(num,0);
	            ans+=count;
	            hm.put(num,count+1);
	        }
	        
	        
	        return ans;
	    }
}
