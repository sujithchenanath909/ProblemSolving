package samples;

import java.util.ArrayList;

/*
 * Rearrange a given array so that Arr[i] becomes Arr[Arr[i]] with O(1) extra space.

Example:

Input : [1, 0]
Return : [0, 1]
 * 
 * 
 * */
public class RearrangeArray {

	 public void arrange(ArrayList<Integer> a) {
	    int n=a.size();
		  for (int i = 0; i < n; i++)
			  a.set(i, a.get(i)+(a.get(a.get(i))%n)*n);
	            
	 
	        // Second Step: Divide all values by n
	        for (int i = 0; i < n; i++)
	        	a.set(i, a.get(i)/n);
	         
	 
	 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
