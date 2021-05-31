package string;
/*
 * Implement strStr().

 strstr - locate a substring ( needle ) in a string ( haystack ). 
Try not to use standard library string functions for this question.

Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack
 * 
 * */
public class ImplementStrStr {
	
	 public static int strStr(final String A, final String B) {
		    int lenA = A.length();
		    int lenB = B.length();
		    if (lenB > lenA) {
		      return -1;
		    }
		    for (int i = 0; i <= lenA - lenB; i++) {
		      if (A.substring(i, i + lenB).equals(B)) {
		        return i;
		      }
		    }
		    return -1;
		  }
	 
	 //with out using subString method
	 public static int strStr2(final String A, final String B) {
		 
		 if(B.isEmpty())
				 return 0;
		 
		 int m=A.length();
		 int n=B.length();
		 
		 if(m<n)
			 return -1;
		 
		 for(int i=0;i<=m-n;++i) {
			 int j;
			 for( j=0;j<n;++j)
			 {
				 
				 if(A.charAt(i+j) != B.charAt(j))
					 break;
			 }
			 if(j==n)
				 return i;
			 
		 }

		 return -1;
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strStr("hello", "lo"));
		System.out.print(strStr2("hello", "ll"));

	}

}
