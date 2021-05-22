package samples;

public class GreatestCommonDivisor {

	public int gcd(int A, int B) {
        int div = A >= B ? A : B;
       while(true){
           if(A % div == 0 && B % div == 0){
               break;
           }
           div--;
       }
       return div;
   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
