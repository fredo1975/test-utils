package fr.utils.polymorphe;

public class C extends B {
	void x(C c){System.out.println("C.X()");}
	void y(C c){System.out.println("C.Y()");}
	
	public static void main(String[] args) {
		A a = new C();
		C c = new C();
		a.x(c);
		a.y(c);
		a.z(c);
	}
}
