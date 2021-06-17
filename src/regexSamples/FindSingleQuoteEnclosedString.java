package regexSamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindSingleQuoteEnclosedString {

	public static String singleQuotes(String str) {
		String result="";
		String regex="'(\\w+\\s?)+'";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(str);
		if(m.find()) {
			
			result=result+m.group(0);
		}
		
		
		
		return result;
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hai this is sujith with '33 years of age '";
		System.out.println(singleQuotes(str));
		System.out.println(singleQuotes("This is 'Test'"));
	}

}
