package samples;

import java.util.ArrayList;

/*
 * You are given an array of N integers, A1, A2 ,…, AN. Return maximum value of f(i, j) for all 1 ≤ i, j ≤ N.
 * f(i, j) is defined as |A[i] - A[j]| + |i - j|, where |x| denotes absolute value of x.
 * 
 * */
public class MaximumAbsoluteDiff {

	 public static int maxArr(ArrayList<Integer> arr) {
	        int max1 = Integer.MIN_VALUE;
	        int max2 = Integer.MIN_VALUE;
	        int min1 = Integer.MAX_VALUE;
	        int min2 = Integer.MAX_VALUE;
	        
	        for (int i=0;i<arr.size();i++) {
	            max1 = Math.max(max1, arr.get(i) + i);
	            min1 = Math.min(min1, arr.get(i) + i);
	            max2 = Math.max(max2, arr.get(i) - i);
	            min2 = Math.min(min2, arr.get(i) - i);
	        }
	        
	        return Math.max(max1 - min1, max2 - min2);
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list=new ArrayList<>(); 
		list.add(1);
		list.add(3);
		list.add(-1);
		
		System.out.println(maxArr(list));

	}

}
