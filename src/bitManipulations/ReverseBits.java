package bitManipulations;
/*
 * Given a non-negative integer n. The problem is to reverse the bits of n and print the number obtained after reversing the bits. Note that the actual binary representation of the number is being considered for reversing the bits, no leading 0’s are being considered.
Examples : 
 

Input : 11
Output : 13
(11)10 = (1011)2.
After reversing the bits we get:
(1101)2 = (13)10.
 * */
public class ReverseBits {
	
	public static int bitReverse(int n) {
		 int rev = 0;
		 
	       
	        while (n > 0)
	        {
	            // bitwise left shift
	            // 'rev' by 1
	            rev <<= 1;
	 
	            // if current bit is '1'
	            if ((int)(n & 1) == 1)
	                rev ^= 1;
	 
	            // bitwise right shift
	            //'n' by 1
	            n >>= 1;
	        }
	        // required number
	        return rev;
	
	}
	
	public long reverse(long a) {
		//reverses 32 bit long 
        long result = 0;
      int i = 31;
      while(a > 0){
          result += (a % 2) * Math.pow(2, i);
          i--;                        
          a = a/2;
      }
      return result;
  }
	
	public static void main(String[] args) {
		
		System.out.println(bitReverse(3));
	}

}
