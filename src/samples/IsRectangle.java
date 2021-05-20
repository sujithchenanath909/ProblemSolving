package samples;
/*
 * Given four positive integers A, B, C, D, determine if there’s a rectangle such that the lengths of its sides are A, B, C and D (in any order).

If any such rectangle exist return 1 else return 0.



Problem Constraints
1 <= A, B, C, D <= 100
 * 
 * */
public class IsRectangle {
	public int solve(int A, int B, int C, int D) {
        if (A == B && A == C &&
           A == D && C == D &&
           B == C && B == D)
           return 1;
    
       else if (A == B && C == D)
           return 1;
       else if (A == D && C == B)
           return 1;
       else if (A == C && D == B)
           return 1;
       else
           return 0;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
