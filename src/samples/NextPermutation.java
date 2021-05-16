package samples;

import java.util.ArrayList;

//Java program to implement
//the next_permutation method

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NextPermutation {

	// Function to swap the data
	// present in the left and right indices
	public static ArrayList<Integer>  swap(ArrayList<Integer> data, int left, int right)
	{

		// Swap the data
		int temp = data.get(left);
		data.set(left,data.get(right));
		data.set(right, temp);
		// Return the updated list
		return data;
	}

	// Function to reverse the sub-array
	// starting from left to the right
	// both inclusive
	public static  ArrayList<Integer> reverse( ArrayList<Integer> data, int left, int right)
	{

		// Reverse the sub-array
		while (left < right) {
			int temp = data.get(left);
			data.set(left++,data.get(right));
			data.set(right--, temp);
			
		}

		// Return the updated list
		return data;
	}

	
	 public static ArrayList<Integer> nextPermutation(ArrayList<Integer> A) {

	       
	        
	    if (A.size() <= 1)
				{
			Collections.sort(A);
			return A;}
//
			int last = A.size() - 2;

			// find the longest non-increasing suffix
			// and find the pivot
			while (last >= 0) {
				if (A.get(last) < A.get(last+1)) {
					break;
				}
				last--;
			}

			// If there is no increasing pair
			// there is no higher order permutation
			if (last < 0) {
				Collections.sort(A);
				return A;}
			

			int nextGreater = A.size() - 1;

			// Find the rightmost successor to the pivot
			for (int i = A.size()  - 1; i > last; i--) {
				if (A.get(i) > A.get(last)) {
					nextGreater = i;
					break;
				}
			}

			// Swap the successor and the pivot
	
			A = swap(A, nextGreater, last);

			// Reverse the suffix
			A = reverse(A, last + 1,A.size()  - 1);
			
			// Return true as the next_permutation is done
			return A;
	        
	        
	        
	    }
	// Function to find the next permutation
	// of the given integer array
/*	public static boolean findNextPermutation(int data[])
	{

		// If the given dataset is empty
		// or contains only one element
		// next_permutation is not possible
		if (data.length <= 1)
			return false;

		int last = data.length - 2;

		// find the longest non-increasing suffix
		// and find the pivot
		while (last >= 0) {
			if (data[last] < data[last + 1]) {
				break;
			}
			last--;
		}

		// If there is no increasing pair
		// there is no higher order permutation
		if (last < 0)
			return false;

		int nextGreater = data.length - 1;

		// Find the rightmost successor to the pivot
		for (int i = data.length - 1; i > last; i--) {
			if (data[i] > data[last]) {
				nextGreater = i;
				break;
			}
		}

		// Swap the successor and the pivot
		data = swap(data, nextGreater, last);

		// Reverse the suffix
		data = reverse(data, last + 1, data.length - 1);

		// Return true as the next_permutation is done
		return true;
	}*/

	// Driver Code
	public static void main(String args[])
	{
		int data[] = { 1, 2, 3 };
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(769);
		a.add(533);
		
		
		ArrayList<Integer> sol=nextPermutation(a);
	
			System.out.println(sol.toString());
		
	}
}
