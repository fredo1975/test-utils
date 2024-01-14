package fr.bluechipit.divers;

public class Main {
	public static void main(String[] args) { 
		String name = "James gosling"; // I want to change the 'g' to a 'G'. 
		// Will this work at compile time? 
		//name.charAt(6) = 'G';
		StringBuilder s = new StringBuilder();
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i) == 'g' && i==6) {
				s.append("G");
			}else {
				s.append(name.charAt(i));
			}
		}
		// Print with the standard system println to see “James Gosling” 
		System.out.println(s);
	}
}
