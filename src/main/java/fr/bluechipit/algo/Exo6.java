package fr.bluechipit.algo;

public class Exo6 {
    public static void main(String[] args) {
        Exo6 exo6 = new Exo6();
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        exo6.exo1(arr);
        int[] arr2 = {3, 8, 2, 10, 5};
        exo6.exo2(arr2);
        String chaine  = "java";
        exo6.exo3(chaine);
        String palindrome = "radar";
        exo6.exo4(chaine);
        exo6.exo4(palindrome);
        int[] arr3 = {5,1,9,2};
        exo6.exo5(arr3);
    }

    /**
     * Tu reçois un tableau d’entiers. Trouver la somme maximale d’une sous-séquence contiguë.
     */
    private void exo1(int[] nums) {
        System.out.println("exo1 start "+nums);
        int maxCurrent = nums[0];
        int maxGlobal = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxCurrent = Math.max(nums[i], maxCurrent + nums[i]);
            if (maxCurrent > maxGlobal) {
                maxGlobal = maxCurrent;
            }
        }
        //return maxGlobal;
        System.out.println("exo1 maxGlobal "+maxGlobal);
    }

    /**
     * Donne un tableau d’entiers. Retourne le plus grand nombre.
     * [3, 8, 2, 10, 5] → 10
     * @param nums
     */
    private void exo2(int[] nums) {
        System.out.println("exo2 start "+nums);
        int max = nums[0];
        for(int i=0;i<nums.length;i++) {
            int temp = Math.max(max, nums[i]);
            if(temp>max) {
                max = temp;
            }
        }
        System.out.println("exo2 max "+max);
    }

    /**
     * Retourner une chaîne à l’envers. "java" → "avaj"
     * @param chaine
     */
    private void exo3(String chaine) {
        System.out.println("exo2 chaine "+chaine);
        String[] split = chaine.split("");
        StringBuilder sb = new StringBuilder();
        for(int i=split.length-1;i>=0;i--) {
            sb.append(split[i]);
        }
        System.out.println("exo3 sb "+sb.toString());
    }
    /**
     * Dire si une chaîne est un palindrome.
     * "radar" → true  "java" → false
     * @param chaine
     */
    private void exo4(String chaine) {
        System.out.println("exo4 chaine "+chaine);
        int left=0;
        int right = chaine.length()-1;
        boolean isPalindrome = true;
        while(left<right) {
            if(chaine.charAt(left) != chaine.charAt(right)) {
                isPalindrome = false;
            }
            left++;
            right--;
        }
        System.out.println("exo4 isPalindrome "+isPalindrome);
    }
    /**
     * Trouver la plus grande différence entre deux éléments du tableau (i < j).
     * [5,1,9,2] → 8 (9 - 1)
     * @param arr
     */
    private void exo5(int[] arr) {
        System.out.println("exo5 arr "+arr);
        int max=0;
        for(int i=0;i<arr.length-1;i++) {
            for(int j=i+1;j<arr.length-1;j++) {
                if(Math.abs(arr[j]) - Math.abs(arr[i])>max) {
                    max = Math.abs(arr[j]) - Math.abs(arr[i]);
                }
            }
        }
        System.out.println("exo5 max "+max);
    }
}
