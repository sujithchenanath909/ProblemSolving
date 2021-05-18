package Algorithms;

import java.util.Arrays;

public class BinarySearch {
	
	public static int binarySearchRes(int[] arr,int val,int l,int h) {
		int res=-1;
		
		//to perform binarySearch Arrays must be in sorted order
		Arrays.sort(arr);
		int mid=0;
		
		while(l< h) {
			 mid=(l+h)/2;
			if(val==arr[mid])
				return mid;
			else if(val<arr[mid])
				h=mid-1;
			else if(val>arr[mid])
				l=mid+1;
			
		}
		
		return res;
	}
	
	public static int  binarySearchRec(int[] arr,int l,int h,int key) {
		int res=-1,mid=0;
		
		Arrays.sort(arr);
		
		if(l==h) {
			
			if(arr[l-1]==key)
				return l;
			else
				return res;
		}
		else
		{
			mid=(l+h)/2;
			System.out.println(key==arr[mid]);
			if(key==arr[mid])
			{
				return mid;
			}

			if(key<arr[mid]) binarySearchRec(arr,l,mid-1,key);
			if(key>arr[mid]) binarySearchRec(arr,mid+1,h,key);
			
		}
		
		
		return res;
		
	}
	
	
	

	public static void main(String[] args) {
		
		int [] arr= {3,5,6,7,8,3,5};
		
		System.out.println(binarySearchRes(arr, 3,0,arr.length));
		System.out.println(binarySearchRec(arr,0,arr.length,3));

	}
/************************Time Complexity*********************************
 * Time complexity of binary search algorithm is O(log n)
 * */
}
