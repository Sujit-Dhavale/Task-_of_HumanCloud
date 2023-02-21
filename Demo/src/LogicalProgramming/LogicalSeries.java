package LogicalProgramming;

public class LogicalSeries {
	public static void main(String[] args) {
		int[] arr = { 0, 0, 0, 0, 1, 0, 1, 0, 1, 0 };
		segeration(arr);
	}

	public static void segeration(int[] arr) {
		int count0 = 0;
		for (int i : arr) {
			if (i == 0) {
				count0++;
			}
		}
		int[] newArray = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (i < count0) {
				newArray[i] = 0;
				continue;
			}
			newArray[i] = 1;
		}
		for (int n : newArray) {
			System.out.print(n + " ");
		}
	}
}
