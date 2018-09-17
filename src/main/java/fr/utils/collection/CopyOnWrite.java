package fr.utils.collection;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.assertj.core.util.Arrays;

public class CopyOnWrite {

	public static void main(String[] args) {
		
		CopyOnWriteArrayList<Integer> numbers = new CopyOnWriteArrayList<>(new Integer[] {5, 3, 1, 8});
		Iterator<Integer> iterator = numbers.iterator();
		numbers.add(10);
		List<Integer> result = new LinkedList<>();
		iterator.forEachRemaining(result::add);
		assertThat(result).containsOnly(1, 3, 5, 8);
		
		Integer[] tab = new Integer[] {1,2,3};
		List<Object> l = Arrays.asList(tab);
		Iterator<Object> it = l.iterator();
		l.add(4);
		List<Object> res = new LinkedList<>();
		it.forEachRemaining(res::add);
		assertThat(res).containsOnly(1, 2, 3);
	}

}
