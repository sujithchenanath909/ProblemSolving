package binarySearchProblems;
/*
 * Algorithm 1
 * ------------
 * we can Run a loop until i*i <= n , where n is the given number. Increment i by 1.
 * The floor of the square root of the number is i – 1
 * ****************************************************************
 * Algorithm 2 Better Approach: 
 * -----------------------------
 * Take care of some base cases, i.e when the given number is 0 or 1.
 * Create some variables, lowerbound l = 0, upperbound r = n, where n is the given number, mid and ans to store the answer.
 * Run a loop until l <= r , the search space vanishes
 * Check if the square of mid (mid = (l + r)/2 ) is less than or equal to n, If yes then search for a larger value in second half of search space, i.e l = mid + 1, update ans = mid
 * Else if the square of mid is more than n then search for a smaller value in first half of search space, i.e r = mid – 1
 * Print the value of answer ( ans)
 * 
 * */
public class SquareRootOfInteger {
	 public static int floorSqrt(int A)
	    {
	        // Base Cases
	        if (A == 0 || A == 1)
	            return A;
	 
	 
	        // Do Binary Search for floor(sqrt(A))
	        long start = 1, end = A, ans=0;
	        while (start <= end)
	        {
	            int mid = (int) (start+ (end-start)/2);
	 
	            // If A is a perfect square
	            if (mid*mid == A)
	                return (int)mid;
	 
	            // Since we need floor, we update answer when mid*mid is
	            // smaller than A, and move closer to sqrt(A)
	            if (mid*mid < A)
	            {
	                start = mid + 1;
	                ans = mid;
	            }
	            else   // If mid*mid is greater than A
	                end = mid-1;
	        }
	        return (int)ans;
	    }
	 
	
	 //Better solution in terms of time 
	 public int sqrt(int A) {
		    if (A <= 1)
	            return A;
	        long start = 0, end = A/2 + 1;
	        while (start <= end) {
	            long mid = (start + end) / 2;
	            if (mid*mid == A) {
	                return (int)mid;
	            }
	            if (mid*mid < A) {
	                start = mid + 1;
	            }
	            else {
	                end = mid - 1;
	            }
	        }
	        
	        return (int)end;
		}
	    // Driver Method
	    public static void main(String args[])
	    {
	        int A = 11;
	        System.out.println(floorSqrt(A));
	    }
	    
	    /*
	     * Time complexity is O(log N)
	     * 
	     * */

}
