package samples;

import java.util.ArrayList;
import java.util.List;

/*
 * 
 * Given numRows, generate the first numRows of Pascal’s triangle.

Pascal’s triangle : To generate A[C] in row R, sum up A’[C] and A’[C-1] from previous row R - 1
 * */
public class PascalTriangle {

	


	 
	//Pascal function to print
	public static void printPascal(int n)
	{
	    for(int line = 1; line <= n; line++)
	    {
	         
	    int C=1;// used to represent C(line, i)
	    for(int i = 1; i <= line; i++)
	    {
	        // The first value in a line is always 1
	        System.out.print(C+" ");
	        C = C * (line - i) / i;
	    }
	    System.out.println();
	    }
	}
	
	//Pascal function to return as list
	 public static ArrayList<ArrayList<Integer>> solve(int A) {
		 ArrayList<ArrayList<Integer>> list=new ArrayList<>();
		 ArrayList<Integer> innerList=null;
		 
		 for(int line = 1; line <= A; line++)
		    {
		  innerList =new ArrayList<>();  
		      
		    int C=1;// used to represent C(line, i)
		    for(int i = 1; i <= line; i++)
		    {
		        // The first value in a line is always 1
		      //  System.out.print(C+" ");
		        innerList.add(C);
		        C = C * (line - i) / i;
		    }
		    list.add(innerList);
		    }
		 
		 
		 return list;
	    }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
	    printPascal(n);
	    System.out.println(solve(n).toString());
	}

}
