package fr.bluechipit.algo;

public class Exo2_2 {
	public static String calc(int i) {
		StringBuilder sb = new StringBuilder();
		int billet = 0;
		double d = Double.valueOf(i);
		if (d / 100 > 1) {
			billet = (int) (d/100);
			d = d - billet * 100;
			sb = sb.append(String.valueOf(billet)).append(" ");
			billet = 0;
		} else {
			sb = sb.append("0 ");
		}
		if (d > 0 && d / 50 > 1) {
			billet = (int)(d / 50);
			i = i - billet * 50;
			sb = sb.append(String.valueOf(billet)).append(" ");
			billet = 0;
		} else {
			sb = sb.append("0 ");
		}
		if (d > 0 && d / 20 > 1) {
			billet = (int)(d / 20);
			d = d - billet * 20;
			sb = sb.append(String.valueOf(billet)).append(" ");
			billet = 0;
		} else {
			sb = sb.append("0 ");
		}
		if (d > 0 && d / 10 > 1) {
			billet = (int)d / 10;
			d = d - billet * 10;
			sb = sb.append(String.valueOf(billet)).append(" ");
			billet = 0;
		} else {
			sb = sb.append("0 ");
		}
		if (d > 0 && d / 2 > 1) {
			billet = (int)d / 2;
			d = d - billet * 2;
			sb = sb.append(String.valueOf(billet)).append(" ");
			billet = 0;
		} else {
			sb = sb.append("0 ");
		}
		if (d > 0) {
			billet = (int)d;
			sb = sb.append(String.valueOf(billet)).append(" ");
		} else {
			sb = sb.append("0 ");
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		String resultat = calc(325);
		System.out.println(resultat);
	}
}
