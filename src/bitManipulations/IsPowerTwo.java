package bitManipulations;
/*
 * Check whether a given number is power of 2 or not
 * 
 * if an integer is power of 2 it will contain only one set bit 
 * 
 * another approach if n & (n-1) is zero then it is power of 2
 * 
 * */
public class IsPowerTwo {

	public static boolean checkPowerTwo(int n) {
		if(n<=0) return false;
		
		if(setBits(n)==1)
			return true;
		else
			return false;
	}
	
	public static int setBits(int n) {
		int count=0;
		
		while(n>0) {
			count++;
			n=n&(n-1);
			
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkPowerTwo(8));
		System.out.println(checkPowerTwo(55));
	}

}
