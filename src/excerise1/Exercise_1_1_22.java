package excerise1;

/**
 * 
 * Binary Search both regular method and recursion
 *
 */

public class Exercise_1_1_22 {

	public static void main(String args[]) {
		int[] a = new int[10];
		for (int i = 0; i < 10; i++) {
			a[i] = i;
		}

		System.out.println(indexOf(a, 4));
		System.out.println(indexOf(a, 9));
		System.out.print(indexOf(a, 10, 0, a.length-1));

	}

	public static int indexOf(int array[], int key) {
		int n = array.length;
		int loIndex = 0;
		int hiIndex = n - 1;

		while (loIndex <= hiIndex) {
			int middleIndex = loIndex + ((hiIndex - loIndex) / 2);
			if (array[middleIndex] == key)
				return middleIndex;
			if (key > array[middleIndex])
				loIndex = middleIndex + 1;
			if (key < array[middleIndex])
				hiIndex = middleIndex - 1;
		}

		return -1;
	}

	public static int indexOf(int array[], int key, int loIndex, int hiIndex) {
		if (loIndex > hiIndex)
			return -1;
		int middleIndex = loIndex + (hiIndex - loIndex) / 2;
		if (array[middleIndex] == key)
			return middleIndex;
		if (array[middleIndex] > key)
			hiIndex = middleIndex - 1;
		if (array[middleIndex] < key)
			loIndex = middleIndex + 1;
		return indexOf(array, key, loIndex, hiIndex);
	}

}
