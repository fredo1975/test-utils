package fr.utils;

public class RefValue {

	public static void changeRef(Integer integer){
		integer = new Integer("5");
	}
	public static void main(String[] args){
		Integer integer = new Integer("6");
		RefValue.changeRef(integer);
		System.out.println("integer="+integer);
	}
	
}

