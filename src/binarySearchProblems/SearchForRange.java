package binarySearchProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Given a sorted array of integers A(0 based index) of size N, find the starting and ending position of a given integar B in array A.
 * Your algorithm’s runtime complexity must be in the order of O(log n).
 * 
 * */
public class SearchForRange {
	ArrayList<Integer> ans = new ArrayList<>();
	
	public ArrayList<Integer> searchRange(final List<Integer> A, int B) {
		
		 ans.add(-1);
		    ans.add(-1);
		    findRange(A, 0, A.size()-1, B);
		    
		    return ans;
	
    
	}
	
	public void findRange(List<Integer> a, int start, int end, int b) {
	    int mid = 0;
	    while (start <= end) {
	        mid = (start + end)/2;
	        if (a.get(mid) == b) {
	            int low = findExtreme(a, start, mid-1, b, true);
	            int high = findExtreme(a, mid+1, end, b, false);
	            
	            ans.set(0, low == -1 ? mid : low);
	            ans.set(1, high == -1 ? mid : high);
	            return;
	        }
	        else if (a.get(mid) < b) {
	            start = mid+1;
	        }
	        else {
	            end = mid-1;
	        }
	    }
	}
	
	public int findExtreme(List<Integer> a, int start, int end, int b, boolean left) {
	    int idx = -1;
	    int mid = 0;
	    while (start <= end) {
	        mid = (start + end)/2;
	        if (a.get(mid) == b) {
    	        idx = mid;
    	        if (left) {
    	            end = mid-1;
    	        }
    	        else {
    	            start = mid+1;
    	        }
    	    }
            else if (a.get(mid) < b) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
	    }
	    
	    return idx;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> A=Arrays.asList(5, 7, 7, 8, 8, 10);
		
		System.out.println(new SearchForRange().searchRange(A,8).toString());

	}

}
