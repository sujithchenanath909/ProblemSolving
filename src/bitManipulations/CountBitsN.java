package bitManipulations;

import java.util.ArrayList;

/*
 * return a arrayList with number of setbits for n numbers 
 * 
 * for example if n =5
 * 
 * {0,1,1,2,1,2}
 * 
 * */
public class CountBitsN {

	public static ArrayList<Integer> setBitsCount(int num){
		
		ArrayList<Integer> list=new ArrayList<>();
		
		for(int i=0;i<=num;i++) 
			list.add(setBits(i));
		return list;
	}
	
	public static int setBits(int n) {
		int count=0;
		
		while(n>0) {
			count++;
			n=n&(n-1);
			
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(setBitsCount(4).toString());
	}

}
