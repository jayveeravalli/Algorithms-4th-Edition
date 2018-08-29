package excerise1;

class Prime {

	private Prime() {
	}

	public static boolean isPrime(int number) {
		if (number == 0 || number == 1)
			return false;
		if (number == 2)
			return true;
		int count = 0;
		for (int i = 1; i <= Math.sqrt(number); i++) {
			if (number % i == 0)
				count++;
		}

		if (count > 1) {
			return false;
		}
		return true;

	}

}

public class Exercise_1_1_30 {

	public static void main(String args[]) {
		printNbyNMatrix(6);
	}

	public static void printNbyNMatrix(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (Prime.isPrime(i) && Prime.isPrime(j)) {
					System.out.print(true + " ");
				} else {
					System.out.print(false + " ");
				}
			}
			System.out.println();
		}
	}

}
