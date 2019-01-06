package fr.bluechipit.sgcib.test;

import java.util.HashSet;
import java.util.Set;

public class Synchronize {
	private Set<String> s = new HashSet<>();

	public synchronized void method(String p) {
		s.add(p);
	}

	public void pause() {
		try {
			wait();
		} catch (InterruptedException e) {
			System.exit(1);
		}
	}

	public static void main(String[] args) {
		Synchronize syn = new Synchronize();
		syn.method("bonjour");
		syn.pause();
	}
}