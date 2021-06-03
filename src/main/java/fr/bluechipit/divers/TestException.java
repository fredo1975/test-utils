package fr.bluechipit.divers;

public class TestException {

	public static void methode1() throws Exception {
		try {
			methode2();
			throw new Exception("methode1");
		}finally {
			System.out.println("finally methode1");
		}
	}
	public static void methode2() throws Exception {
		try {
			methode3();
			throw new Exception("methode2");
		}finally {
			System.out.println("finally methode2");
		}
	}
	public static void methode3() throws Exception {
		try {
			throw new Exception("methode3");
			
		}finally {
			System.out.println("finally methode3");
		}
	}
	public static void main(String[] args) throws Exception {
		methode1();
	}
}
