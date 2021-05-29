package binarySearchProblems;

public class ImplementPowerFunction {

	public int solution(int A,int B,int d) {
		
		 if(A == 0){
		      return 0;
		    }
		    if(B == 0){
		      return 1;
		    }
		    int check = 0;
		    if(A < 0){
		      A = Math.abs(A);
		      check = B % 2 != 0 ? 1 : 0;
		    }
		    long rem = 1;
		    long temp = A % d;
		    while(B != 0){
		      rem = B % 2 != 0 ? (rem * temp) % d : rem;
		      temp = temp * temp;
		      temp = temp % d;
		      B /= 2;
		      rem = rem % d;
		    }
		    return check == 1 ? d - (int)rem : (int)rem;
		  }
	
	
	public static void main(String[] args) {
		
		System.out.println(new ImplementPowerFunction().solution(2, 3, 3) );

	}

}
