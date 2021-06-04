package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReverseWords {

	public static String reverseWords(String A) {
		StringBuilder reversedString=new StringBuilder();
		
		String[] words=A.split(" ");
		
		for(int i=words.length-1 ;i>=0;i--) {
			
			Pattern pattern = Pattern.compile("\\s");
			Matcher matcher = pattern.matcher(words[i].trim());
			boolean found = matcher.find();
			boolean isWhitespace =words[i].trim().matches("^\\s*$");
		
			
			if(!isWhitespace)
			reversedString.append(words[i].trim()).append(" ");
		}
		
		
		return reversedString.toString().trim();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(reverseWords("qxkpvo  f   w vdg t wqxy ln mbqmtwwbaegx   mskgtlenfnipsl bddjk znhksoewu zwh bd fqecoskmo"));
	}

}
