package samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LargestNumber {
/**
 * Given a list of non negative integers, arrange them such that they form the largest number.
 * Given [3, 30, 34, 5, 9], the largest formed number is 9534330.
 * 
 * **/
	
	
	 public static String largestNumber(final List<Integer> A) {
		
		// int[] nums=A.toArray();
		 //Change Integer Array to String
		 String[] arr = new String[A.size()];
		    for(int i=0; i<A.size(); i++){
		        arr[i]=String.valueOf(A.get(i));
		    }
		//Sort Arrays using sort mechanism comparator  
		    Arrays.sort(arr, new Comparator<String>(){
		        public int compare(String a, String b){
		            return (b+a).compareTo(a+b);
		        }
		    });
		 
		    //Append using string builder
		    StringBuilder sb = new StringBuilder();
		    for(String s: arr){
		        sb.append(s);
		    }
		 
		    //delete first charector if it is zero
		    while(sb.charAt(0)=='0'&&sb.length()>1)
		        sb.deleteCharAt(0);
		 
		    return sb.toString();
		 
	
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l=new ArrayList<>();
		l.add(3);
		l.add(30);
		l.add(34);
		l.add(5);
		l.add(9);
		
		System.out.println(largestNumber(l));
	}

}
