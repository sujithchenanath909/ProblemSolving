package samples;

import java.util.ArrayList;

public class FizzBuzz {
/*
 * Given a positive integer A, return an array of strings with all the integers from 1 to N.
But for multiples of 3 the array should have “Fizz” instead of the number.
For the multiples of 5, the array should have “Buzz” instead of the number.
For numbers which are multiple of 3 and 5 both, the array should have “FizzBuzz” instead of the number.
 * */
	
	
	 public static ArrayList<String> fizzBuzz(int A) {
		 
		 ArrayList<String> list=new ArrayList<>();
		 
	     for (int i=1; i<=A; i++)                                
	        {
	            //number divisible by 15(divisible by
	            // both 3 & 5), print 'FizzBuzz' in
	            // place of the number
	            if (i%15==0)
	            	list.add("FizzBuzz");
	                //System.out.print("FizzBuzz"+" ");
	            // number divisible by 5, print 'Buzz'
	            // in place of the number
	            else if (i%5==0)  
	            	list.add("Buzz");
	                //System.out.print("Buzz"+" ");
	 
	            // number divisible by 3, print 'Fizz'
	            // in place of the number
	            else if (i%3==0) 
	            	list.add("Fizz");
	                //System.out.print("Fizz"+" ");
	                 
	            else // print the numbers
	            	list.add(""+i);
	                //System.out.print(i+" ");                        
	        }
	     return list;
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fizzBuzz(50).toString());

	}

}
