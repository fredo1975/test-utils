package fr.bluechipit.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SetTest {

	
	public static void main(String[] args) {
		SortedSet<String> set1 = new TreeSet<String>();

		set1.add("toto");
		set1.add("azerty");
		set1.add("querty");
		set1.add("titi");
		set1.add("tata");
		System.out.println("first="+set1.first());
		System.out.println("last="+set1.last());
		System.out.println("headSet="+set1.headSet("titi").toString());
		System.out.println("tailSet="+set1.tailSet("querty").toString());
		
		for(String s : set1){
			System.out.println(s);
		}
		
	}

}
