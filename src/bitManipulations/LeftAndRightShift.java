package bitManipulations;

public class LeftAndRightShift {

	public static int leftShift(int n,int i) {
		
		return (int) (n*(Math.pow(2, i)));
	}
	
	public static int rightShift(int n,int i) {
		
		return (int) (n/(Math.pow(2, i)));
	}
	
	
	public static void main(String[] args) {
	
		System.out.println(leftShift(22,2));
		System.out.println(rightShift(22,2));

	}

}
