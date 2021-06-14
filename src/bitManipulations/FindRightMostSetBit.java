package bitManipulations;
/*
 *Find the right most set bit in a given integer 
 * */
public class FindRightMostSetBit {

	public static int findrightSetBit(int n) {
		
		if(n==0) return 0;
		int i=0;
		while(n>0) {
			
			if((n & 1)==1) return i;
			i++;
			n=n>>1;
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		System.out.println(findrightSetBit(2));
		System.out.println(findrightSetBit(22));

	}

}
