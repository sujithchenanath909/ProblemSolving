package string;

public class IntegerToRoman {
	
	 static String intToRoman(int A)
	    {// storing roman values of digits from 0-9
	        // when placed at different places
	        String m[] = {"", "M", "MM", "MMM"};
	        String c[] = {"", "C", "CC", "CCC", "CD", "D",
	                            "DC", "DCC", "DCCC", "CM"};
	        String x[] = {"", "X", "XX", "XXX", "XL", "L",
	                            "LX", "LXX", "LXXX", "XC"};
	        String i[] = {"", "I", "II", "III", "IV", "V",
	                            "VI", "VII", "VIII", "IX"};
	             
	        // Converting to roman
	        String thousands = m[A/1000];
	        String hundereds = c[(A%1000)/100];
	        String tens = x[(A%100)/10];
	        String ones = i[A%10];
	             
	        String ans = thousands + hundereds + tens + ones;
	             
	        return ans;
	    }
	    
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int number = 3000;
	        System.out.println(intToRoman(number));
	}

}
