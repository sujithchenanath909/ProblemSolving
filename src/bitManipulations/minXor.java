package bitManipulations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class minXor {
	
	public static int minXor(ArrayList<Integer> A) {
		
		int res=Integer.MAX_VALUE;
		Collections.sort(A);
		System.out.println(A.toString());
		for(int i=0;i<A.size()-1;i++)
			res=Math.min(res, A.get(i) ^ A.get(i+1));
	
		
		return res;
		
	}

	public static void main(String[] args) {
	
		ArrayList<Integer> list=new ArrayList<>(Arrays.asList(0,5,2,7));
		System.out.println(minXor(list));
	}

}
