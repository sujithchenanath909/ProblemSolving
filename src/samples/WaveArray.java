package samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 * Given an array of integers, sort the array into a wave like array and return it,
 * In other words, arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5.....
 * */
public class WaveArray {

	
	public static ArrayList<Integer> wave(ArrayList<Integer> A) {
		
		
		int n=A.size();
		 Collections.sort(A);
		 
	        // Swap adjacent elements
	        for (int i=0; i<n-1; i += 2)
	            swap(A, i, i+1);
	        
	        return A;
    
	}
	
	static void swap(ArrayList<Integer> A, int a, int b)
    {
        int temp = A.get(a);
        A.set(a, A.get(b));
      A.set(b, temp);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> i=new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		
		System.out.println(wave(i).toString());
	}

}
