package bitManipulations;
/*
 * given an integer array and q quiries of form L R .find XOR of elements 
 * from Lto R for given array
 * Example
 * ----------
 * A={1,3,4,8}
 * L=0 R=3 
 * o/p : 14
 * 
 * ie. 1^3^4^8 =14
 *  
 * */

public class SubArrayXOR {

	public static int subarrayXOR(int[] A, int l, int r) {
		int res = 0;
		int pre[] = new int[A.length];

		pre[0] = A[0];

		for (int i = 1; i < A.length; i++) {

			pre[i] = pre[i - 1] ^ A[i];

		}
		
		if(l>0) 
			res=pre[r] ^ pre[l-1];
		if(l==0)
			res=pre[r];	

		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = { 1, 3, 4, 8 };

		System.out.println(subarrayXOR(A, 0, 3));
	}

}
