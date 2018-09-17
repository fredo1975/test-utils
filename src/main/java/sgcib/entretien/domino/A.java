package sgcib.entretien.domino;

public class A {
	public A(){
		System.out.println("constructor A");
		print();
	}
	public static void main(String[] args){
		A a = new B();
		a.print();
	}
	public void print(){
		System.out.println("dans A");
	}
}