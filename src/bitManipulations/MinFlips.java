package bitManipulations;
/*
 * Find the minimum number of flips required to make A or B = C 
 * assuming for 32 bit integer
 * 
 * */
public class MinFlips {
	
	public static int minFlips(int a ,int b, int c) {
		int res=0;
		
		for(int i=0;i<32;i++) {
			
			boolean x=false, y=false,z=false;
			int F=1;
			F<<=i;
			if((F&a)>0)
				x=true;
			if((F&b)>0)
				y=true;
			if((F&c)>0)
				z=true;
			
			if(z==false) {
				
				if(x==true && y==true)
					res+=2;
				else if(x==true || y==true)
					res++;
			}else {
				
				if(x==false && y==false)
					res++;
			}
			
		}
		
		
		return res;
	}

	public static void main(String[] args) {
		System.out.println(minFlips(2, 6, 5));
		System.out.println(minFlips(4, 2, 7));

	}

}
