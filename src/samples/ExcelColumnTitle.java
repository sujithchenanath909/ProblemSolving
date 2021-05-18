package samples;
/*
 * Given a positive integer A, return its corresponding column title as appear in an Excel sheet.
 * 
 * */
public class ExcelColumnTitle {

	
	public static String convertToTitle(int A) {

        StringBuilder s = new StringBuilder();

        while(A > 0){
            int n = A%26;

            if(n == 0){
                s.append("Z");
                A = A/26 - 1;
            }
            else{
            	System.out.println(n);
                s.append((char)(n+64));
                A = A/26;
            }
        }

        return s.reverse().toString();
    }
	
	
	public static void main(String[] args) {

		System.out.println((char)65);
System.out.println(convertToTitle(980089));
		

	}

}
