package bitManipulations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Given an array of integers, every element appears twice except for one.
 * Find that single one.
 * Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 * Algorithm
 * ------------
 * A^A gives 0 
 * 
 * */
public class SingleNumber {

	public static int singleNumber(final List<Integer> A) {
        int num = A.get(0);
       for (int i=1; i<A.size(); i++) {
           num ^= A.get(i);
       }
       return num;
   }
	
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>(Arrays.asList(1,2,3,3,2,1,5)) ; 
		System.out.println(singleNumber(list));
	}

}
