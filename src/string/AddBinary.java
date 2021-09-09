package string;

/*Given two binary strings a and b, return their sum as a binary string.
 * 
 * Example 1:
 * ----------
 * Input: a = "11", b = "1"
 * Output: "100"
 * 
 * */

public class AddBinary {
	
	public static String addBinary(String a, String b) {
		
		char[] digita=a.toCharArray();
		char[] digitb=b.toCharArray();
		
		int m=digita.length-1;
		int n=digitb.length-1;
		int x=0;
		StringBuilder sb=new StringBuilder();
		while(m>=0 || n>=0 || x>0) {
			
			x+=m>=0?digita[m--] -'0' : 0;
			x+=n>=0?digitb[n--] -'0' : 0;
			
			sb.insert(0,(char) ((x%2)+ '0'));
			x /= 2;
		}
		
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="1010";
		String b="1011";
		
		System.out.println(addBinary(a,b));
	}

}
