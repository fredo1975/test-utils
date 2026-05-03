package fr.bluechipit.algo;

import java.util.List;

/**
 * Étant donné un tableau d’entiers (positifs et négatifs), tu dois trouver la somme maximale d’un sous-tableau contigu.
 * 🧪 Exemple
 *
 * Entrée
 *
 * 8
 * -2 1 -3 4 -1 2 1 -5
 *
 *
 * Sortie
 *
 * 6
 */
public class Exo4 {
    public static void main(String[] args) {
        Exo4 exo4 = new Exo4();
        int max = exo4.methodA(List.of(-2,1,-3,4,-1,2,1,-5));
        System.out.println(max);
    }
    public int methodA(List<Integer> items) {
        System.out.println("In methodA");
        int maxSoFar = Integer.MIN_VALUE;
        int sum = 0;
        for (Integer item : items) {
            sum = Math.max(item, sum + item);
            maxSoFar = Math.max(maxSoFar, sum);
        }
        return maxSoFar;
    }
}
