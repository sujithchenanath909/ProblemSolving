package samples;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Given an array A of size N. You need to find the sum of Maximum and Minimum element in the given array.
 * */
public class MaxMin {

	
	public static int solve(ArrayList<Integer> A) {
		int result=0;
		int max=0,min=1;
		for(int i=0;i<A.size();i++) {
			
			if(A.get(i)>max)
				max=A.get(i);
			if(A.get(i)<min)
				min=A.get(i);
			
		}
		
		result=max+min;
		//using collections
		//result=Collections.max(A)+Collections.min(A);
		return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
