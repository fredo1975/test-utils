package fr.bluechipit.divers;

public class RefValue {

	public static void changeRef(Integer integer){
		integer = Integer.valueOf("5");
	}
	public static void main(String[] args){
		Integer integer = Integer.valueOf("6");
		RefValue.changeRef(integer);
		System.out.println("integer="+integer);
	}
	
}

