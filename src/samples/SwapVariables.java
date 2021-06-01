package samples;

public class SwapVariables {
	
	static int a=2;
	static int b=3;
	
	public void swap() {
		
		a=b-a;
		b=b-a;
		a=a+b;
		
	}
	
	//optimized solution
	public void swapOptimised() {
		
		a=a^b;
		System.out.println("A is  " + a);
		b=a^b;
		System.out.println("B is "+b);
		a=a^b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwapVariables().swapOptimised();
		
		System.out.println("A = "+a + " B ="+b);
	}

}
