package fr.bluechipit.divers;

import java.util.HashSet;
import java.util.Set;

public class TrickyTest {
	public static void main(String[] args) {
		method(null);
		int[] nums = new int[3];
		nums[0]=1;
		nums[1]=1;
		nums[2]=2;
		int res = removeDuplicates(nums);
		System.out.println(res);
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}
	public static void method(Object o) {
		System.out.println("Object impl");
	}
	public static void method(String s) {
		System.out.println("String impl");
	}
	
	public static int removeDuplicates(int[] nums) {
        int res=0;
        Set<Integer> set = new HashSet<Integer>(nums.length);
        for(int i=0;i<nums.length;i++){
            if(set.add(nums[i])==true){
                res++;
            }
        }
        nums = new int[set.size()];
        int i=0;
        for(Integer n : set) {
        	nums[i++] = n.intValue();
        }
        return res;
    }
}
