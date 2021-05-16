package samples;

import java.util.ArrayList;
import java.util.Collections;

/*
 * You are given an n x n 2D matrix representing an image.

 * Rotate the image by 90 degrees (clockwise).

 * You need to do this in place.

 *  Note that if you end up using an additional array, you will only receive partial score.
 * 
 * **/
public class RotateMatrix {

	public static void rotate(ArrayList<ArrayList<Integer>> a) {

		int n = a.size();

		Collections.reverse(a);
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int temp = a.get(i).get(j);
				a.get(i).set(j, a.get(j).get(i));
				a.get(j).set(i, temp);
			}
		}

	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
