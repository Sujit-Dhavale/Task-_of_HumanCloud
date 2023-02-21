package LogicalProgramming;

import java.util.Arrays;
public class EvenNo {
	public static void main(String[] args) {

		int[] a = { 2, 4, 5, 7, 8, 10, 14, 98, 78, 90, 24 };

		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
			}
		}
	}
}