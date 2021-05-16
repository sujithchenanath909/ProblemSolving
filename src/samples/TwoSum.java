package samples;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {
		
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        if (map.containsKey(complement)) {
	            return new int[] { map.get(complement), i };
	        }
	        map.put(nums[i], i);
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] val={3,3,6};
		int [] arr=twoSum(val,6);
		
		for(int n:arr) {
			
			System.out.println(n);
		}
	}

}
