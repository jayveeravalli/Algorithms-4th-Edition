package excerise1;

/***
 * 
 * Fibonacci Sum by storing previous values in an array
 * 
 * */

public class Exercise_1_1_19 {
	
	public static void main(String args[]) {
		System.out.println(fibonacci(2));
		System.out.println(fibonacci(3));
		System.out.println(fibonacci(10));
	}
	
	public static long fibonacci(int n) {
		long[] a = new long[n+1];
		a[0] = 0;
		a[1] = 1;
		if(n==0) return a[0];
		if(n==1) return a[1];
		
		for(int i = 2; i<=n; i++) {
			a[i] = a[i-1] + a[i-2];
		}

		return a[n];
		
	}

}
