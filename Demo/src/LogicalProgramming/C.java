package LogicalProgramming;

  class A {
  
	public  static   void m1() {
		System.out.println(" A method");
	}
}

class  B extends A{
	public  static   void m1() {
		System.out.println(" b method");
	}

}

 class M extends B{
	public  static   void m1() {
		System.out.println(" c method");
	}
}
  public class C{
	public static void main(String[] args) {
		
		  B b=new M();
		  b.m1();
	}
}