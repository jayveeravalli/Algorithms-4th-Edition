package excerise1;

/***
 * 
 * 
 * Remove Duplicates from an array
 * 
 * */

import java.util.Arrays;

public class Excercise_1_1_28 {
	
	public static void main(String args[]) {
		int[] a = {1,2,2,3,3,3,3,4,4,4,4,5,5,5,5,5,5,5,5,5,5,6,6,6,6,66,7,8,0,90,9,100};
		System.out.println(Arrays.toString(removeDuplicates(a)));
	}
	
	public static int[] removeDuplicates(int[] array) {
		Arrays.sort(array); // To sort the array
		int temp[] = new int[array.length];
		int count = 0;
		temp[count] = array[0];
		for(int a : array) {
			if(temp[count] == a) {
				continue;
			} else {
				temp[++count] = a;
			}
		}
		
		int result[] = new int[count+1];
		result = Arrays.copyOf(temp, count +1);
		
		return result;
	}

}
