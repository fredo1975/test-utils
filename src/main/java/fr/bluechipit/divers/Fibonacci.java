package fr.bluechipit.divers;
import java.util.HashMap;
import java.util.Map;


public class Fibonacci {
	static Map<Integer,Long> map = new HashMap<Integer, Long>();
	public static Long Fibo(Integer n){
		if(n==0){
			return 0l;
		}
		if(n<=2 && n>0){
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
		// 0=0 1=1 2=1 3=2 4=3 5=5 6=8 7=13	8=21 9=34 10=55 11=89 12=144 13=233	14=377 15=610 16=987	...
		System.out.println(Fibonacci.Fibo(Integer.valueOf(16)));
	}
}
