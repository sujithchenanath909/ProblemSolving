package string;

import java.util.Arrays;

/*
 * Given a string and number of rows ‘n’. Print the string formed by 
 * concatenating n rows when input string is written in row-wise Zig-Zag 
 * fashion.
 * */
public class ZigZagString {
	
	public static String ZigZag(String A,int B) {
		String result="";
		String[] resArray=new String[B];
		 Arrays.fill(resArray, "");
		char[] charArray=A.toCharArray();
		int len=A.length();
		int row = 0;
        boolean down = true; 
        
        if (B == 1)
        {
            
            return A;
        }
        
		for(int i = 0; i < len; ++i) {
			
			resArray[row] += (charArray[i]);
		    
            // If last row is reached,
            // change direction to 'up'
            if (row == B - 1)
            {
                down = false;
            }
             
            // If 1st row is reached,
            // change direction to 'down'
            else if (row == 0)
            {
                down = true;
            }
 
            // If direction is down,
            // increment, else decrement
            if (down)
            {
                row++;
            }
            else
            {
                row--;
            }
			
		}
		
		for(String c: resArray) {
			result+=c;
		}
		
		return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "GEEKSFORGEEKS";
        int n = 3;
        System.out.println(ZigZag(str, n));
	}

}
