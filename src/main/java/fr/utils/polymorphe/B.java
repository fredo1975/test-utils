package fr.utils.polymorphe;

public class B extends A{

	void x(B b){System.out.println("B.X()");}
	void y(B b){System.out.println("B.Y()");}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A a = new B();
		B b = new B();
		a.x(b);
		a.y(b);
		a.z(b);
	}

}
