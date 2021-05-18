package samples;

public class PowerOfTwoIntegers {

	
	   static boolean isPower(int A)
	    {
		   double p;
		    if (A <= 1)
		    {
		        return true;
		    }
		     
		    for(int i = 2; i <= Math.sqrt(A); i++)
		    {
		       p = Math.log(A) / Math.log(i);
		        
		       if ((Math.ceil(p) == Math.floor(p)) && p > 1)
		       {
		           return true;
		       }
		    }
		    return false;
	    }
	 
	   static int isPower1(int A)
	    {
	        for (int x = 2; x <= Math.sqrt(A); x++) {
	            int p = x;
	 
	            while (p <= A) {
	                p = p * x;
	                if (p == A)
	                    return 1;
	            }
	        }
	        return 0;
	    }
	   
	   static int optimumSol(int A) {

	       if(A == 1){
	            return 1;
	        }

	        for(int i=2;i<=Math.sqrt(A);i++){
	            int p = A;

	            while(p%i == 0){
	                p /= i;
	            }
	            if(p == 1){
	                return 1;
	            }
	        }

	        return 0;
		   
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for (int i = 2; i < 100; i++)
	            if (isPower(i))
	                System.out.print(i + " ");
	}

}
