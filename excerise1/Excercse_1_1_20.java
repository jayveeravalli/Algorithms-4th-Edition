package excerise1;

/*
 * 
 * Calculate ln of n!
 * 
 * */

public class Excercse_1_1_20 {
	
	public static void main(String args[]) {
		System.out.println(factLn(10));
	}
	
	public static double factLn(int n) {
		return Math.log(fact(n));
	}
	
	public static long fact(int n) {
		if(n==0) return 1;
		if(n==1) return 1;
		return n * fact(n-1);
	}

}
