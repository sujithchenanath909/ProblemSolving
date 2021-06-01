package samples;

import java.util.Arrays;

/*
 * Test whether a string is having unique charactors or not
 * 
 * */
public class StringUniqueChar {

	public boolean testUnique(String str) {
		
		boolean[] char_set=new boolean[256];
		
		for(int i=0;i<str.length();i++) {
			
			int val=str.charAt(i);
			if(char_set[val]) return false;
			else
				char_set[val]=true;
		}
		
		return true;
	}
	/*
	 * Time complexity for this algorithm is O(n) and space complexity is also o(n)
	 * If we were allowed to destroy the string then we can sort the string and check for adjacent charectors
	 * */
	
	public boolean testUniqueAfterSorting(String str) {
		
		 // convert input string to char array
        char tempArray[] = str.toCharArray();
          
        // sort tempArray
        Arrays.sort(tempArray);
		
		for(int i=0;i<tempArray.length-1;i++) {
			
			if(tempArray[i]==tempArray[i+1]) return false;
		}
		
		return true;
	}
	/*
	 * Arrays.sort is having time complexity of O(n log n) and for searching adjacent charectors it will take O(n) so overall O(n log n)
	 * */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.out.println(new StringUniqueChar().testUnique("Sujith"));
			System.out.println(new StringUniqueChar().testUniqueAfterSorting("Sujithh"));
	}

}
