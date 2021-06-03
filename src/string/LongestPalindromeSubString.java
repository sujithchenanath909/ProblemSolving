package string;
/*
 * Given a string, find the longest substring which is palindrome. 
 * */

//naive approach
public class LongestPalindromeSubString {

	public static String findLongest(String A) {

		String result = "";
		int len = A.length();
System.out.println(len);
		
		int maxlen = 0;
		for (int i = 0; i < len ; i++) {
			for (int j = i + 1; j <= len ; j++) {
				String subString = A.substring(i, j);
				System.out.println(A.substring(i, j));
				String finalSubString = "";
				if (checkPalindrome(subString)) {
					
					if (maxlen < subString.length()) {
						maxlen = subString.length();
						finalSubString = subString;
						result=finalSubString;
						
					}
				}

			}

		}

		 return result;

	}

	public static boolean checkPalindrome(String str) {

		StringBuilder rev = new StringBuilder(str).reverse();
		boolean res = str.equals(rev.toString()) ? true : false;
		//System.out.println(res);
		return res;
	}

	
	//optimum solution
	 public String longestPalindrome(String A) {
	        int start = 0;
	        int end = 0;
	        
	        for (int i=0;i<A.length();i++) {
	            int len1 = expandCenter(A, i, i);
	            int len2 = expandCenter(A, i, i+1);
	            
	            int len = Math.max(len1, len2);
	            if (len > end - start + 1) {
	                start = i - (len - 1)/2;
	                end = i + len/2;
	            }
	        }
	        
	        return A.substring(start, end + 1);
	    }
	    
	    public int expandCenter(String s, int left, int right) {
	        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
	            left--;
	            right++;
	        }
	        
	        return right - left - 1;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(findLongest("a"));
	}

}
