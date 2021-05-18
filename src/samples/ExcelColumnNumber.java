package samples;
/*
 * Given a column title A as appears in an Excel sheet, return its corresponding column number.
 * ex: 1--> A 28-->AB
 * */
public class ExcelColumnNumber {

	 public static int titleToNumber(String A) {

	        int ans = 0;

	        for(int i=0;i<A.length();i++){
	            ans  = 26*ans;
	            ans += A.charAt(i) - 'A' + 1;
	        }

	        return ans;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(titleToNumber("AB"));
	}

}
