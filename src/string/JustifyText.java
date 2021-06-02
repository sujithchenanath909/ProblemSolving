package string;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Given a string str and width of each line as L, the task is to justify the string such that each line of
 *  justified text is of length L with help of space (‘ ‘) and the last line should be left-justified.
 *  
 *  Input: str = “The quick brown fox jumps over the lazy dog.”, L = 11
 *  Output:
 *  The___quick
 *  brown___fox
 *  jumped_over
 *  the____lazy
 *  dogs.______
 *  The symbol _ denotes a space.
 * */
public class JustifyText {
	
	//my solution
	public static StringBuilder justifyString(String str,int len) {
		
		String[] splittedText=str.split(" ");
		StringBuilder newString=new StringBuilder();
		for(int i=0;i<splittedText.length-1;i=i+2) {
			newString.append(splittedText[i]);
			if((splittedText[i].length()+splittedText[i+1].length())<len) {
				
				int length=splittedText[i].length()+splittedText[i+1].length();
				int noOfSpaces=len-length;
				String space="";
				for(int j=0;j<noOfSpaces;j++)
					space+=" ";
				newString.append(space).append(splittedText[i+1]).append("\r\n");				
			}
			
			
		}
		if(splittedText[splittedText.length-1].length()<len) {
			int lastNoOfSpaces=len-splittedText[splittedText.length-1].length();
			String lastSpace="";
			for(int j=0;j<lastNoOfSpaces;j++)
				lastSpace+=" ";
			
			newString.append(splittedText[splittedText.length-1]).append(lastSpace);
		}
		
		return newString;
	}
	
	//interview Bit Solution using ArrayList
	public static ArrayList<String> fullJustify(ArrayList<String> A, int B) {
		
		 ArrayList<String> lines = new ArrayList<>();

	        int index = 0;
	        while (index < A.size()) {
	            int count = A.get(index).length();
	            int last = index + 1;
	            while (last < A.size()) {
	                if (A.get(last).length() + count + 1 > B) break;
	                count += A.get(last).length() + 1;
	                last++;
	            }

	            StringBuilder builder = new StringBuilder("");
	            int diff = last - index - 1;
	            if (last == A.size() || diff == 0) {
	                for (int i = index; i < last; i++) {
	                    builder.append(A.get(i)).append(" ");
	                }
	                builder.deleteCharAt(builder.length() - 1);
	                for (int i = builder.length(); i < B; i++) {
	                    builder.append(" ");
	                }
	            } else {
	                int spaces = (B - count) / diff;
	                int r = (B - count) % diff;
	                for (int i = index; i < last; i++) {
	                    builder.append(A.get(i));
	                    if (i < last - 1) {
	                        for (int j = 0; j <= spaces + (i - index < r ? 1 : 0); j++) {
	                            builder.append(" ");
	                        }
	                    }
	                }
	            }
	            lines.add(builder.toString());
	            index = last;
	        }
	        return lines;
		
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String stringToJustify="The quick brown fox jumps over the lazy dog.";
		//The quick b
		//rown fox ju
		//mps over th
		//e lazy dog.
		
		System.out.println(stringToJustify.length());
		
		
		StringBuilder str=justifyString(stringToJustify,11);
		System.out.println(str.toString());
		
		StringBuilder str2=justifyString("GeeksforGeek is the best computer science portal for geeks.", 16);
		System.out.println(str2.toString());
		
		ArrayList<String> strList=new ArrayList<>(Arrays.asList("The" ,"quick", "brown" , "fox" , "jumps" ,"over" , "the" ,"lazy" ,"dog."));
		Arrays.asList("","");
		System.out.println(fullJustify(strList,11).toString());
		

	}

}
