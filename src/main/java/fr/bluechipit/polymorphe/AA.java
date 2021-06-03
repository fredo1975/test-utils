package fr.bluechipit.polymorphe;

class AA {
	int i;
	public AA(){
		System.out.println("constructor A");
	}
	int f() {
		return i;
	}
	static String g() {
		return ("A");
	}
	String h() {
		return g();
	}
}
class BB extends AA {
	int i = 2;
	public BB(){
		System.out.println("constructor B");
	}
	int f() {
		return -i;
	}
	static String g() {
		return ("B");
	}
	String h() {
		return g();
	}
}

class test {
	public static void main(String[] args) {
		BB b = new BB();
		System.out.println("b.i="+b.i);
		System.out.println("b.f()="+b.f());
		System.out.println("BB.g()="+BB.g());
		System.out.println("b.h()="+b.h());
		AA a = b;
		System.out.println("a.i="+a.i);
		System.out.println("a.f()="+a.f());
		System.out.println("AA.g()="+AA.g());
		System.out.println("a.h()="+a.h());
	}
}