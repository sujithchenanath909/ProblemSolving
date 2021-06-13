package bitManipulations;
/*
 * Check ith bit is set or not
 * Given N
 * 1.) set a variable F=1;
 * 2.)left shift F i times F<<i
 * 3.)if( N & F ) == 0 then ith bit is not set
 * 4.)if(N & F) >0 then ith bit is set 
 * 
 * */
public class CheckIthBit {
	
	public static boolean checkBit(int n,int i) {
		
		int F=1;
		F<<=i;
		
		if((F & n) > 0) {
			
			return true;
			
		}else
			return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkBit(32,4));
		System.out.println(checkBit(32,5));
	}

}
