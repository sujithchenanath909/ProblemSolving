package samples;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Rearrange a given array so that Arr[i] becomes Arr[Arr[i]] with O(1) extra space.

Example:

Input : [1, 0]
Return : [0, 1]
 * 
 * 
 * */
public class RearrangeArray {

	 public static void arrange(ArrayList<Integer> a) {
	    int n=a.size();
		  for (int i = 0; i < n; i++)
			  a.set(i, a.get(i)+(a.get(a.get(i))%n)*n);
	            
	 
	        // Second Step: Divide all values by n
	        for (int i = 0; i < n; i++)
	        	a.set(i, a.get(i)/n);
	         
	        System.out.println(a.toString());
	 }
	 
	 //another solution from geeks not tested!!
	 void rearrangeNaive(int arr[], int n)
	    {
	        // Create an auxiliary array of same size
	        int temp[] = new int[n];
	        int i;
	 
	        // Store result in temp[]
	        for (i = 0; i < n; i++)
	            temp[arr[i]] = i;
	 
	        // Copy temp back to arr[]
	        for (i = 0; i < n; i++)
	            arr[i] = temp[i];
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(0);
		list.add(2);
		System.out.println(list.toString());
		arrange(list);
		
		System.out.println(list.toString());

	}

}
