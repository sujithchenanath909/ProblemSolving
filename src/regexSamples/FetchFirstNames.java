package regexSamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FetchFirstNames {

	public static ArrayList<String> fetchNames(ArrayList<String> fullNames) {

		ArrayList<String> names = new ArrayList<String>();
		Pattern p = Pattern.compile("Mr?s?\\.?\\s?([A-Z](\\w+)?)");

		for (String str : fullNames) {
			Matcher m = p.matcher(str);
			if (m.find()) {

				names.add(m.group(1));

			}
		}
		return names;
	}

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>(
				Arrays.asList("Mrs. Robinson", "Mr. T", "Mr. Schafer", "Mr Smith", "Ms Davis"));

		System.out.println(fetchNames(names).toString());

	}

}
