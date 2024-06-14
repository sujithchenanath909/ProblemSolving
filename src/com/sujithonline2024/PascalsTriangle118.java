/*
 * Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
 * 
 * Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]
 * */

package com.sujithonline2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generate(1);
		System.out.println(generate(1).toString());
		System.out.println(generate(30).toString());
	}

	  public static List<List<Integer>> generate(int numRows) {
		  List<List<Integer>> res=new ArrayList<>();    
		  if(numRows ==1) {
			  res.add(Arrays.asList(1));
			  return res;
		  }
		  res.add(Arrays.asList(1));
		  res.add(Arrays.asList(1,1));
		  if(numRows ==2)
			  return res;
		  for(int i=2 ;i<numRows ;i++) { 
			  
			 List<Integer> prev = res.get(i-1); //[1,1]
			 int len =prev.size(); //1
			 List<Integer> newRow = new ArrayList<Integer>();
			 newRow.add(1);
			 for(int j=1 ; j<len;j++) {
				 newRow.add(prev.get(j-1)+prev.get(j));
			 }
			  newRow.add(1);
			  res.add(newRow);
		  }
		  
		  return res;
	    }
}
