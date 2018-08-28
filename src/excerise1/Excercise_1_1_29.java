package excerise1;

public class Excercise_1_1_29 {

	public static void main(String args[]) {

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

	public static int rank(int array[], int key) {
		if(key < array[0]) return 0;
		if(key > array[array.length]) return array.length;
		
		int count = 0;
		for (int a : array) {
			if (a < key)
				count++;
			if (a >= key)
				break;
		}
		return count;
	}
	
	public static int count(int array[], int key) {
		if(key < array[0] || key > array[array.length]) return 0;
		if(indexOf(array, key, 0, array.length-1) == -1) return 0;
		
		int count = 0;
		for(int a : array) {
			if(a==key) count ++;
			if(a>key) break;
		}
		
		return count;
	}

}
