package fr.bluechipit.divers;

public class TestString {
	public static void main(String args[]) {

		String str1 = "Bonjour";
		String str2 = "Bonjour";
		System.out.println(str1.equals(str2) ? "str1.equals(str2)" : "!str1.equals(str2)");
		System.out.println(str1 == str2 ? "str1 == str2" : "str1 != str2");

		System.out.println("str1.hashCode()=" + str1.hashCode() + " str2.hashCode()=" + str2.hashCode());
		str1 = str2;
		System.out.println("str1.hashCode()=" + str1.hashCode() + " str2.hashCode()=" + str2.hashCode());

		str2 = "Aurevoir";
		System.out.println("str1.hashCode()=" + str1.hashCode() + " str2.hashCode()=" + str2.hashCode());

		String str3 = new String("Fredo");
		String str4 = new String("Fredo");
		System.out.println(str4.equals(str3) ? "str4.equals(str3)" : "!str4.equals(str3)");
		System.out.println(str4 == str3 ? "str4==str3" : "str4!=str3");
		System.out.println("str3.hashCode()=" + str3.hashCode() + " str4.hashCode()=" + str4.hashCode());
	}
	

	public void test1() {
		System.out.println("t1");
	}
	
	public void test2() {
		System.out.println("t1");
	}
	public void test3() {
		System.out.println("t1");
	}
	
	public void test4() {
		System.out.println("t1");
	}
	
}
