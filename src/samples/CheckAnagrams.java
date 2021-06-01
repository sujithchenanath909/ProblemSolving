package samples;

import java.util.Arrays;

/*
 * An anagram of a string is another string that contains the same characters, only the order of characters can be different.
 *  For example, “abcd” and “dabc” are an anagram of each other.
 * */
public class CheckAnagrams {
	
	static boolean isAnagram(String str1,String str2) {
		
		char[] st1=str1.toCharArray();
		char[] st2=str2.toCharArray();
		
		Arrays.sort(st1);
		Arrays.sort(st2);
		
		if(st1.length != st2.length)
			return false;
		
		for(int i=0;i<st1.length;i++) {
			
			if(st1[i]!=st2[i])
				return false;
		}
		
		return true;
	}
/*
 * Time complexity used here is O(n log n)
 * */
	public static void main(String[] args) {
		
		
		System.out.println(isAnagram("abcd","dcba"));
		System.out.println(isAnagram("abcdee","dcbae"));
		System.out.println(isAnagram("abc","dcb"));
		

	}

}
