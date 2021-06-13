package regexSamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * return timestamp , cpu and memory from the string 
 * "198653 cpu=256 memory=8GB"
 * */
public class SplitString {
	
	public static void printValues(String str) {
		
		long timestamp;
		String cpu;
		String mem;
		
		 String regex = "([0-9]{6}) (cpu=(\\d+)) (memory=(.*))";
	
		
		 Pattern p=Pattern.compile(regex);
		 Matcher m=p.matcher(str);
		 if(m.find()) {
			
			 timestamp=Long.parseLong(m.group(1));
			 cpu=m.group(3);
			 mem=m.group(5);
			 System.out.println( timestamp +":"+ cpu +":"+mem);
		 }
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printValues("198653 cpu=256 memory=8GB");
	}

}
