package regexSamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Clean up the file names ,remove dot and add space
 * File names to be cleaned 
 * ...
 * Funny.TV.Show.Season.2.Episode.08.avi
 * Funny.TV.Show.Season.2.Episode.09.avi
 * Funny.TV.Show.Season.2.Episode.10.avi
 * Funny.TV.Show.Season.2.Episode.11.avi
 * ...
 * The cleaned up names look like this:
 * ...
 * Funny TV Show Season 2 Episode 09.avi
 * Funny TV Show Season 2 Episode 10.avi
...
 * */
public class CleanUp {

	
	
	
public static String cleanUp(String str) {
		
		
		String regex="([^.]+)\\.(.*?)\\.([^.]+)$";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(str);
		while(m.find()) {
			System.out.println("Matched String is ::"+m.group());
			return "";
		}
			
		
			return "";
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(cleanUp("Funny.TV.Show.Season.2.Episode.08.avi"));
	}

}
