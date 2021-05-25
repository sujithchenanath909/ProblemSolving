package samples;
/*
 * You are given a binary string(i.e. with characters 0 and 1) S consisting of characters S1, S2, …, SN. In a single operation, you can choose two indices L and R such that 1 ≤ L ≤ R ≤ N and flip the characters SL, SL+1, …, SR. By flipping, we mean change character 0 to 1 and vice-versa.

Your aim is to perform ATMOST one operation such that in final string number of 1s is maximised. If you don’t want to perform the operation, return an empty array. Else, return an array consisting of two elements denoting L and R. If there are multiple solutions, return the lexicographically smallest pair of L and R.

Notes:

Pair (a, b) is lexicographically smaller than pair (c, d) if a < c or, if a == c and b < d.
 * 
 * 
 * 
 * */
import java.util.ArrayList;

public class Flip {
	public ArrayList<Integer> flip(String A) {
        ArrayList<Integer> result = new ArrayList<Integer> ();

		if (A.length() == 0) return result;

		int [] m = new int [ A.length()];

		char [] chars = A.toCharArray();
		int numOnes =0;
		for ( int i=0;i<chars.length;i++ ){
			m[i] = chars[i]=='0'?1:-1;
			numOnes += m[i];
		}
		
		if ( numOnes == -m.length) return result;

		//Now, Kadane's.
		int leftLimitForThisBestSum=0;
		int rightLimitForThisBestSum=0;
		int thisBestSum = m[0];
		int prevBestSum = m[0];

		int leftLimitOfBestSum =0;
		int rightLimitOfBestSum =0;
		int bestSum = m[0];

		for ( int i = 1; i < m.length; i++ ){
			int prevPlusThisNum=m[i]+prevBestSum;
			if ( m[i] > prevPlusThisNum){
				leftLimitForThisBestSum=i;
				rightLimitForThisBestSum=i;
				thisBestSum=m[i];
			}
			else {
				rightLimitForThisBestSum=i;
				thisBestSum=prevPlusThisNum;
			}

			if ( thisBestSum > bestSum){
				bestSum=thisBestSum;
				leftLimitOfBestSum  = leftLimitForThisBestSum;
				rightLimitOfBestSum = rightLimitForThisBestSum;
			}
			prevBestSum=thisBestSum;
		}

		result.add(leftLimitOfBestSum+1);
		result.add(rightLimitOfBestSum+1);
		return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "100010011111111111111110000000000000000000000000000000001";
		System.out.println( new Flip().flip(s));

	}

}
