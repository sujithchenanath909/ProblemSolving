package samples;

import java.util.Arrays;

public class RemoveDuplicateChar {


		 static String removeDuplicate(char str[], int n)
		    {
		        // Used as index in the modified string
		        int index = 0;
		 
		        // Traverse through all characters
		        for (int i = 0; i < n; i++)
		        {
		 
		            // Check if str[i] is present before it
		            int j;
		            for (j = 0; j < i; j++)
		            {
		                if (str[i] == str[j])
		                {
		                    break;
		                }
		            }
		 
		            // If not present, then add it to
		            // result.
		            if (j == i)
		            {
		                str[index++] = str[i];
		            }
		        }
		        return String.valueOf(Arrays.copyOf(str, index));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aabbccdd";
		String afterDup=removeDuplicate(str.toCharArray(),str.length());
		System.out.println(afterDup);
	}

}