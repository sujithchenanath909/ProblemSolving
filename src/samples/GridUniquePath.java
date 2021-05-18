package samples;
/*
 * A robot is located at the top-left corner of an A x B grid (marked ‘Start’ in the diagram below).

Path Sum: Example 1

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked ‘Finish’ in the diagram below).

How many possible unique paths are there?
 * 
 * 
 * */
public class GridUniquePath {

	
    static int findComb(int n, int k){

        int res = 1;

        if( k > n-k){
            k = n-k;
        }

        for(int i=0;i<k;i++){
            res *= (n-i);
            res /= (i+1);
        }

        return res;
    }

    public static int uniquePaths(int A, int B) {

        return findComb(A+B-2, A-1);

    }
    
    public static int reccursiesol(int A,int B) {
    	
    	if(A == 1 || B ==1) return 1;
    	return reccursiesol(A-1,B) + reccursiesol(A,B-1);

    	}
    	
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println(reccursiesol(2,2));
System.out.println(uniquePaths(2,2));
	}

}
