package sgcib.entretien.domino;

public class B extends A{
	int i=10;

	{
		System.out.println("syso");
	}
	static{
		System.out.println("static syso");
	}
	public B(){
		System.out.println("constructor B");
		print();
	}
	@Override
	public void print(){
		System.out.println("dans B "+i);
	}
}