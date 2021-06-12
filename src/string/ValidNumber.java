package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidNumber {
	
	 public static int isNumber(final String A) {
		 //works for integers only 
		 String regex = "[+-]?[0-9]+";
		 Pattern p=Pattern.compile(regex);
		 Matcher m=p.matcher(A);
		 
		 if(m.find() && m.group().equals(A))
			 return 1;
		 else
			 return 0;
		 
	 }
	 
	 public static int isNumber2(final String A) {
		    char[] ch = A.toCharArray();
		    int decCount = 0;
		    int digCount = 0;
		    int signCount = 0;
		    for (int i=0; i<ch.length; i++) {
		      if (Character.isDigit(ch[i])) {
		        digCount++;
		        continue;
		      }
		      else if (ch[i] == '+' || ch[i] == '-') {
		        if (i == 0) {
		          continue;
		        }
		        if (ch[i-1] != 'e') {
		          return 0;
		        }
		      }
		      else if (ch[i] == ' ') {
		        continue;
		      }
		      else if (ch[i] == '.') {
		        decCount++;
		        if (decCount > 1) return 0;
		        if (i == ch.length-1) return 0;
		      }
		      else if (ch[i] == 'e') {
		        if(i+2 >= ch.length) return 0;
		        try {
		          if (A.substring(i+1).indexOf('.') != -1) return 0;
		          int num = Integer.parseInt(A.substring(i+1));
		        } catch(Exception e) {
		          return 0;
		        }
		      }
		      else {
		        return 0;
		      }
		    }

		    return digCount > 0 ? 1 : 0;
		  }

	public static void main(String[] args) {
		System.out.println(isNumber2("abc"));
		System.out.println(isNumber2("2e10"));

	}

}
