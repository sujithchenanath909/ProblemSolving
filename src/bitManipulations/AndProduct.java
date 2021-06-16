package bitManipulations;

/*
 * Given two integers a and b find the and product of a to b 
 * solution
 * -------
 * ith bit have 2^i consecutive 0's and 1's
 * for example 
 * 0 : 0000
 * 1 : 0001
 * 2 : 0010
 * 3 : 0011
 * ..........
 * 
 * claim say d= b-a +1 if d>2^i then ith bit in result also will be zero no action
 * if d<=2^i  then the ith bit lays in same pack so check if ith bit of a and b are both one
 * then result also will be 1 in that case add 2^i with result
 * 
 * */
public class AndProduct {

	public static int andProduct(int a, int b) {
		int res = 0;
		int d = b - a;
		int f = 1;
		for (int i = 0; i < 4; i++) {
			f <<= i;

			if (d > f)
				continue;

			if (d <= f) {

				if (((a & f) > 0) && ((b & f) > 0))
					res += f;
			}
		}

		return res; // note: res not correct need to check and debug
	}

	public static int andProduct2(int a, int b) {
		int res = 0;
		int d = b - a;
		int f = 1;
		for (int i = 31; i >= 0; i--) {
			if ((a & (1 << i)) == (b & (1 << i))) {
				res += (a & (1 << i));
			} else {
				break;
			}
		}

		return res; // note: res not correct need to check and debug
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(andProduct(12, 15));
		System.out.println(andProduct2(12, 15));
		 System.out.println(andProduct2(2, 3));
		 System.out.println(andProduct2(8, 13));
	}

}
