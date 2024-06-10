/*
 * A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in non-decreasing order by height. Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.

You are given an integer array heights representing the current order that the students are standing in. Each heights[i] is the height of the ith student in line (0-indexed).

Return the number of indices where heights[i] != expected[i].
 

Example 1:

Input: heights = [1,1,4,2,1,3]
Output: 3
Explanation: 
heights:  [1,1,4,2,1,3]
expected: [1,1,1,2,3,4]
Indices 2, 4, and 5 do not match.
Example 2:

Input: heights = [5,1,2,3,4]
Output: 5
Explanation:
heights:  [5,1,2,3,4]
expected: [1,2,3,4,5]
All indices do not match.
 * 
 * */
package com.sujithonline.easy;

import java.util.Arrays;

public class HeightChecker1051 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] heights= {1,1,4,2,1,3};
		System.out.println(getIncorrectPosition(heights));
	}
	
	private static int getIncorrectPosition(int[] heights) {
		int result=0;
		Integer[] heightsTemp = new Integer[heights.length] ;
		copyArray(heightsTemp , heights);
		Arrays.parallelSort(heights);
		printArray(heights);
		for(int i=0;i<heights.length;i++) {
			System.out.println(heights[i]+"=="+heightsTemp[i]);
			if(heights[i]!=heightsTemp[i])
				result++;
		}
		
		return result;
	}
	
	private static void printArray(int[] a) {
	
		for(int i=0 ; i<a.length;i++)
		System.out.println(a[i]+",");
	}
	
	private static void copyArray(Integer[] a,int[] b) {
		for(int i=0;i<b.length;i++)
			a[i]=b[i];
	}

}
