package binarySearchProblems;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Given a sorted array arr[] consisting of N distinct integers and 
 * an integer K, the task is to find the index of K, if it’s present 
 * in the array arr[]. Otherwise, find the index where K must be inserted
 *  to keep the array sorted.
 * */
public class InsertSortedPosition {
	static int find_index(int[] arr, int n, int K)
	{
	     
	    // Lower and upper bounds
	    int start = 0;
	    int end = n - 1;
	 
	    // Traverse the search space
	    while (start <= end)
	    {
	        int mid = (start + end) / 2;
	 
	        // If K is found
	        if (arr[mid] == K)
	            return mid;
	 
	        else if (arr[mid] < K)
	            start = mid + 1;
	 
	        else
	            end = mid - 1;
	    }
	 
	    // Return insert position
	    return end + 1;
	}
	public static int searchInsert(ArrayList<Integer> a, int b) {
		int n=a.size();
		  int start = 0;
		    int end = n - 1;
		 
		    // Traverse the search space
		    while (start <= end)
		    {
		        int mid = (start + end) / 2;
		 
		        // If K is found
		        if (a.get(mid) == b)
		            return mid;
		 
		        else if (a.get(mid)  < b)
		            start = mid + 1;
		 
		        else
		            end = mid - 1;
		    }
		 
		    // Return insert position
		    return end + 1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 3, 5, 6 };
	    int n = arr.length;
	    int K = 2;
	     ArrayList<Integer> a=new ArrayList<Integer>(Arrays.asList(1, 3, 5, 6));
	    System.out.println(find_index(arr, n, K));
	    System.out.println(searchInsert(a,2));
	}

}
