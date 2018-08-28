package excerise1;

public class EuclidsAlgorithm {
	
	public static void main(String args[]) {
		
	}
	
	public static int gcd(int p, int q) {
		if(q==0) return p;
		int r = p%q;
		return gcd(q,r);
	}

}
