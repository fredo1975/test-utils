package fr.bluechipit.divers;
import java.util.HashMap;
import java.util.Map;


public class Fibonacci {

	static Map<Integer,Long> map = new HashMap<Integer, Long>();
	public static Long Fibo(Integer n){
		if(n<=0){
			return 0l;
		}
		if(n<=2){
			return 1l;
		}
		Long val = map.get(n);
		if(null == val){
			val = Fibo(n-1)+Fibo(n-2);
			map.put(n, val);
		}
		return val;
	}
	public static void main(String[] args) {
		for(int i=0;i<=100;i++){
			System.out.println(Fibonacci.Fibo(new Integer(i)));
		}
		
	}

}
