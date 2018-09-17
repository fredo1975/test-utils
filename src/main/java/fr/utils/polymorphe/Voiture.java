package fr.utils.polymorphe;

public class Voiture {
	public Voiture(){
		System.out.println("Voiture");
	}
	public void demarre(){System.out.println("Voiture.demarre");}
	public void demarre(Voiture v){System.out.println("Voiture.demarre");}
}
