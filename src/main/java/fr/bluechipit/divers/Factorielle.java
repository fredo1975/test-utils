package fr.bluechipit.divers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Factorielle {
	protected static final Logger logger = LoggerFactory.getLogger(Factorielle.class);
	public static int factorielle1(int n) {
		int result = 1;
		for(int i=1;i<=n;i++) {
			result = result*i;
		}
		return result;
	}
	
	
	public static int recursiveFactorielle(int n) {
		int result=1;
		int i=n;
		if(i>0) {
			result = i * recursiveFactorielle(n-1);
			i--;
		}
		return result;
	}
	public static void main(String[] args) {
		int n=5;
		int factorielle1 = factorielle1(5);
		logger.info("factorielle1 de "+n+ " est egalle a " +factorielle1);
		int recursivefactorielle = recursiveFactorielle(5);
		logger.info("recursivefactorielle de "+n+ " est egalle a " +recursivefactorielle);

	}

}
