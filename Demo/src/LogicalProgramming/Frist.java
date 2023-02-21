package LogicalProgramming;

public class Frist {
	int i = 10;

	public Frist(int j) {
		System.out.println(i);
		this.i = j * 10;
	}

}

class Second extends Frist {

	public Second(int j) {
		super(j);
		System.out.println(i);
		this.i = j * 20;
	}
}
