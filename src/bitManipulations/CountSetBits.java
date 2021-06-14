package bitManipulations;

/*
 * Count number of set bits in a binary represenation of an integer
 * 
 * Algorithm
 * ---------
 * 
 * while N>0 
 * 	check N&1 > 0 if true count++
 * 	right shift N by 1 and perform operation again
 * 
 * 
 * */

public class CountSetBits {
	
	//O(logN)
	public static int countSetBits(int n) {
		int count=0;
		
		while(n>0) {
		
			if((n & 1)>0)
				count++;
			
			//perform right shift on n
			n>>=1;
			
		}
		return count;
	}
	
	public static int countBits2(int n) {
		int count=0;
		
		while(n>0) {
			
			count++;
			n=n&(n-1);
			
			
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countSetBits(12));
		System.out.println(countBits2(12));
	}

}
