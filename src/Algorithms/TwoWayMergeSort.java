package Algorithms;

public class TwoWayMergeSort {

	public static int[] Merge(int[] A, int[] B, int m, int n) {

		int i = 0, j = 0, k = 0;
		int[] C = new int[m+n];
		while (i < m && j < n) {

			if (A[i] < B[j]) {
				C[k] = A[i];
				i++;
				k++;
			} else {

				C[k] = B[j];
				j++;
				k++;
			}

		}
		for (; i < m; i++)
			C[k++] = A[i];
		for (; j < n; j++)
			C[k++] = B[j];

		return C;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 5, 7, 9 ,12};
		int[] arr2 = {2, 4, 6, 8, 10,11 };

		int[] res = Merge(arr, arr2, arr.length, arr2.length);
		
		for(int n:res) {
			System.out.println(n);
		}

	}

}

/*****************Time Complexity***********************************
 * Merging n elements in each pairs ..
 * No of passes : log n
 * there are n merges in each pass
 * so total time complexity of this algorithm is O(n log n)
 * */
