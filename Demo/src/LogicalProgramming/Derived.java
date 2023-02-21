package LogicalProgramming;

public class Derived extends Base {
	private int data;

	public Derived() {
		data = 6;
	}

	public int getData() {       // private
		return data;
	}

	public static void main(String[] args) {
		Derived mydata = new Derived();
		System.out.println(mydata.getData());
	}
}
