package fr.bluechipit.polymorphe;

class Polymorph {
	public static void display() {
		System.out.println("Static or class method from Polymorph");
	}

	public void print() {
		System.out.println("Non-static or instance method from Polymorph");
	}
}

class Derived extends Polymorph {
	public static void display() {
		System.out.println("Static or class method from Derived");
	}

	public void print() {
		System.out.println("Non-static or instance method from Derived");
	}
}

class Test2 {
	public static void main(String args[]) {
		Polymorph obj = new Derived();
		Polymorph.display();
		Derived.display();
		obj.print();
	}
}