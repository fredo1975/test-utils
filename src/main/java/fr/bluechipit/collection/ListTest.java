package fr.bluechipit.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ListTest {
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
			Thread currThread = Thread.currentThread();
			Iterator<String> it = l.iterator();
			while(it.hasNext()) {
				System.out.println("currThread.getName()="+currThread.getName()+" s="+it.next());
				//it.remove();
			}
			l.add("az");
		}
	}
}
