package fr.bluechipit.collection;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWrite {

	public static void main(String[] args) throws InterruptedException {
		Integer[] tab = new Integer[] {5000, 3000, 1000, 8000, 1500000};
		CopyOnWriteArrayList<Integer> numbers = new CopyOnWriteArrayList<>(tab);
		Iterator<Integer> iterator = numbers.iterator();
		numbers.add(10);
		List<Integer> result = new LinkedList<>();
		iterator.forEachRemaining(result::add);
		assertThat(result).containsOnly(5000, 3000, 1000, 8000, 1500000);
		CopyOnWrite c = new CopyOnWrite();
		Runnable r1 = c.new RunnableWithCopy(numbers);
		Runnable r2 = c.new RunnableWithCopy(numbers);
		Runnable r3 = c.new RunnableWithCopy(numbers);
		Thread thread1 = new Thread(r1);
		Thread thread2 = new Thread(r2);
		Thread thread3 = new Thread(r3);
		thread1.start();
		thread2.start();
		thread3.start();
		
		thread1.join();
		thread2.join();
		thread3.join();
		numbers.stream().forEach(System.out::println);
		/*
		Integer[] tab = new Integer[] {1,2,3};
		List<Object> l = Arrays.asList(tab);
		Iterator<Object> it = l.iterator();
		l.add(4);
		List<Object> res = new LinkedList<>();
		it.forEachRemaining(res::add);
		assertThat(res).containsOnly(1, 2, 3);*/
	}
	
	private class RunnableWithCopy implements Runnable{
		CopyOnWriteArrayList<Integer> numbers;
		
		public RunnableWithCopy(CopyOnWriteArrayList<Integer> numbers) {
			super();
			this.numbers = numbers;
		}

		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName());
			for(int i=0;i<1;i++) {
				numbers.add(i);
			}
		}
		
	}

}
