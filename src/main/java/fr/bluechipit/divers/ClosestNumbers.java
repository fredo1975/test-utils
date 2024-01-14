package fr.bluechipit.divers;

import java.util.Arrays;

public class ClosestNumbers {
	static int distClosestNumbers(int[] numbers) {
        int min=99;
        Arrays.sort(numbers);
        for(int i=1;i<numbers.length;i++){
            int diff = numbers[i-1]-numbers[i];
            int abs = Math.abs(diff);
            min = abs<min?abs:min;
        }
        return min;
    }
    
    public static void main(String[] args) {
        int[] testArray = {3, 9, 50, 15, 99, 7, 98, 65};
        int result = distClosestNumbers(testArray);
        System.out.println(result); // Expected result is 1 (the 2 closest numbers are 98 and 99)
    }
}
