package LogicalProgramming;

public class FibonciiSeries {
	public static void main(String[] args) {
		// 0,1,2,3,4,5,6,7,8,9
		int a = 0;
		int b = 1;
		int c;
		for (int i = 0; i <= 10; i++) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}
	}
}