package regexSamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Check if a string contains atleast one lowercase letter one upper case letter
 * one special charactor and a digit 
 * */
public class StringCheck {

	public static boolean checkString(String str) {
		
		
		String regex="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[-+_!@#$%^&*., ?]).+$";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(str);
		if(m.find()) {
			System.out.println("Matched String is ::"+m.group());
			return true;
		}
			
		
			return false;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(checkString("909#Aami*909"));
		System.out.println(checkString("909#aami"));

	}

}
