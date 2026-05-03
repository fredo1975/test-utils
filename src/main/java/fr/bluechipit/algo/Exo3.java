package fr.bluechipit.algo;

import java.util.List;

/**
 * Étant donnée une liste de températures (positives et négatives), tu dois afficher celle qui est la plus proche de zéro.
 *
 * ⚖️ Règle importante
 *
 * Si deux températures sont à égale distance de zéro (ex: -5 et 5), choisis la valeur positive.
 * 🧪 Exemple
 *
 * Entrée
 *
 * 5
 * -10 -5 3 8 5
 *
 *
 * Sortie
 *
 * 3
 */
public class Exo3 {
    public static void main(String[] args) {
        Exo3 ex = new Exo3();
        int closest = ex.enter(5, List.of(-10,-5,3,8,5));
        System.out.println(closest);
    }

    private int enter(int nb, List<Integer> temperature){
        int closest = Integer.MAX_VALUE;
        for(Integer t : temperature){
            if(Math.abs(t)<Math.abs(closest) || (Math.abs(t)==Math.abs(closest) && t>0)){
                closest = t;
            }
        }
        return closest;
    }
}
