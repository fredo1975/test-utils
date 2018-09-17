package fr.utils.polymorphe;

public class VoitureElectrique extends Voiture{
	public VoitureElectrique(){
		System.out.println("VoitureElectrique");
	}
	public void demarre(){System.out.println("VoitureElectrique.demarre");}
	public void demarre(VoitureElectrique ve){System.out.println("VoitureElectrique.demarre");}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Voiture v = new VoitureElectrique();
		VoitureElectrique ve = new VoitureElectrique();
		
		v.demarre();
		v.demarre(v);
		v.demarre(ve);
	}

}
