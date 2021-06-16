package regexSamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Fetch phone number from the address with format 8/9**-***-***
 * Laura Jackson
 * 884-555-8444
 * 443 Maple St., Quahog MS 29348
 * laurajackson@bogusemail.com
 * */
public class FetchPhonenumber {

	public static ArrayList<String> fetchPhone(ArrayList<String> addresses) {
		String phone="";
		String regex="(8|9)\\d\\d-\\d{3}-\\d{4}";
		ArrayList<String> phones=new ArrayList<>();
		Pattern p=Pattern.compile(regex);
		
		for(String address:addresses) {
		
		Matcher m=p.matcher(address);

		if(m.find()) {
			
			phones.add(m.group());
		}
		}
		return phones;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> addresses=new ArrayList<String>();
		
		String address1="Laura Jackson\n"
				+ "884-555-8444\n"
				+ "443 Maple St., Quahog MS 29348\n"
				+ "laurajackson@bogusemail.com ";
		String address2="\n"
				+ "Eric Miller\n"
				+ "470-555-2750\n"
				+ "838 Main St., Balmora MT 56526\n"
				+ "stevemiller@bogusemail.com\n";
		String address3="Dave Arnold\n"
				+ "800-555-6089\n"
				+ "732 High St., Valyria KY 97152\n"
				+ "davearnold@bogusemail.com";
		
		addresses.addAll(Arrays.asList(address1,address2,address3));
		
		System.out.println(fetchPhone(addresses).toString());
	}

}
