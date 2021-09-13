package string;
/*
 * You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
 * Return true if you can reach the last index, or false otherwise.
 * */
public class Jumps {
	
	public static boolean status(int[] array) {
		
		int length=array.length-1;
		for(int i=length;i>=0;i--) {
			
			if(length -i <=array[i])
				length=i;
			
		}
		
		return length==0;
		
	}

	public static void main(String[] args) {
		
		int[] a= {2,3,1,1,4};
		int[] nums= {3,2,1,0,4};
		
		System.out.println(status(a));
		System.out.println(status(nums));

	}

}
