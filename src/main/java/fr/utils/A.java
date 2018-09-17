package fr.utils;

public class A {
	private int val = 0;

	public static void affichePlus(int a) {
		a++;
		System.out.println(a);
	}

	public static void affichePlus(A a) {
		a.val++;
		System.out.println(a.val);
	}

	public static void main(String[] args) {
		A uneClasse = new A();
		A uneAutreClasse = new A();
		affichePlus(uneClasse.val);
		affichePlus(uneClasse.val);
		affichePlus(uneClasse);
		affichePlus(uneClasse);
		affichePlus(uneAutreClasse);
		affichePlus(uneAutreClasse);
		if (uneClasse == uneAutreClasse)
			System.out.println("Egales");
		else
			System.out.println("Differentes");
	}

}
