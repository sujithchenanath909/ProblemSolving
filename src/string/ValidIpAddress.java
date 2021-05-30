package string;

import java.util.ArrayList;
import java.util.LinkedList;

/*
 * Given a string containing only digits, restore it by returning all possible valid IP address combinations.
 * A valid IP address must be in the form of A.B.C.D, where A, B, C, and D are numbers from 0-255. 
 * The numbers cannot be 0 prefixed unless they are 0.
 * 
 * */
public class ValidIpAddress {

	 public ArrayList<String> restoreIpAddresses(String A) {
		    int n = A.length();
		    LinkedList<String> segments = new LinkedList<String>();
		    ArrayList<String> output = new ArrayList<String>();
		    tracking(A, -1, 3, output, segments, n);
		    return output;
		  }

		  private void tracking(String s, int prevPos, int dots, ArrayList<String> output, LinkedList<String> segments, int n) {
		    int maxPos = Math.min(n - 1, prevPos + 4);
		    for (int i = prevPos + 1; i < maxPos; i++) {
		      String segment = s.substring(prevPos + 1, i + 1);
		      if (isValid(segment)) {
		        segments.add(segment);
		        if (dots - 1 == 0) {
		          updateOutput(s, i, n, segments, output);
		        }
		        else {
		          tracking(s, i, dots - 1, output, segments, n);
		        }
		        segments.removeLast();
		      }
		    }
		  }

		  public void updateOutput(String s, int currPos, int n, LinkedList<String> segments, ArrayList<String> output) {
		    String segment = s.substring(currPos + 1, n);
		    if (isValid(segment)) {
		      segments.add(segment);
		      output.add(String.join(".", segments));
		      segments.removeLast();
		    }
		  }

		  public boolean isValid(String segment) {
		    int m = segment.length();
		    if (m > 3)
		      return false;
		    return (segment.charAt(0) != '0') ? (Integer.parseInt(segment) <= 255) : (m == 1);
		  }
		  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(new ValidIpAddress().restoreIpAddresses("25011255255"));

	}

}
