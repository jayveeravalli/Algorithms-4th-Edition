package excerise1;

/**
 * 
 * Write a code fragment that puts the binary representation of a positive integer n into a String n.
 * 
 * */

public class Excersie_1_1_19 {

	public static void main(String[] args) {
		System.out.println("Ans:"+convertToBinary(10));
		System.out.println("Ans:"+convertToBinary(5));
		System.out.println("Ans:"+convertToBinary(0));

	}
	
	
	public static String convertToBinary(int n) {
		if(n==0) {
			return "0";
		}
		String s = "";
		for(int i=n; i>0; i = i/2) {
			s = i%2 + s;
		}
		return s;
	}

}
