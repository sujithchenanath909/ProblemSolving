package bitManipulations;

public class AllPairSum {
	
	public static int allPairSum(int[] A) {
		int sum=0;
		
		for(int i=0;i<A.length;i++) {
			
			sum=sum ^ (A[i]+A[i]);
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		int[] A= {2,4,1};
		
		System.out.println(allPairSum(A));

	}

}
