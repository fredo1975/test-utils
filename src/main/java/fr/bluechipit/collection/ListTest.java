package fr.bluechipit.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ListTest {

	private static void testSubList() {
		List<String> liste = new ArrayList<String>();
	    liste.add("1");
	    liste.add("2");
	    liste.add("3");
	    liste.add("4");
	    liste.add("5");
	    
	    List<String> sousListe = liste.subList(1, 4);
	    
	    for(String s : sousListe) {
	    	System.out.println("sousListe s="+s);
	    }
	    System.out.println("");
	   
	    sousListe.remove(1);
	    for(String s : liste) {
	    	System.out.println("liste s="+s);
	    }
	    System.out.println("");
	   
	    for(String s : sousListe) {
	    	System.out.println("sousListe s="+s);
	    }
	    System.out.println("");
	    liste.remove(1);
	    for(String s : liste) {
	    	System.out.println("liste s="+s);
	    }
	    System.out.println("");
	   
	    for(String s : sousListe) {
	    	System.out.println("sousListe s="+s);
	    }
	    System.out.println("");
	}
	public static void testConcurrentIterator() {
		List<String> l = new ArrayList<>();
		l.addAll(Arrays.asList(new String[] {"1","2","3","4"}));
		ExecutorService executor = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 5; i++) {
			Runnable worker = new IteratorRunnable(l);
			executor.execute(worker);
		}
		executor.shutdown();
		// Wait until all threads are finish
		while (!executor.isTerminated()) {
			//logger.debug("waiting for finish ...");
		}
	}
	public static void main(String[] args) {
		//ListTest.testSubList();
		ListTest.testConcurrentIterator();
	}

	private static class IteratorRunnable implements Runnable{

		List<String> l;
		public IteratorRunnable(List<String> l) {
			this.l=l;
		}
		@Override
		public void run() {
			Iterator<String> it = l.iterator();
			while(it.hasNext()) {
				System.out.println("s="+it.next());
				//it.remove();
			}
			l.add("az");
		}
		
	}
}
