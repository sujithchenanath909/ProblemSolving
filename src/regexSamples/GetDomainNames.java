package regexSamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetDomainNames {

	public static ArrayList<String> getDomainNames(ArrayList<String> list) {
		ArrayList<String> domainList = new ArrayList<String>();
String regex="https?://(www\\.)?(\\w+\\.\\w+)";
		for (String str : list) {

			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(str);
			if (m.find()) {

				domainList.add(m.group(2));
			}
		}
		return domainList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> names = new ArrayList<>(Arrays.asList("https://www.google.com", "http://coreyms.com",
				"https://youtube.com", "https://www.nasa.gov","http://www.mysite.net"));
		
		System.out.println(getDomainNames(names).toString());
	}

}
