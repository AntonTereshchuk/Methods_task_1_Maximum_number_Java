package task;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		int[] array = new int[10];
		
		Random rn = new Random();
		
		for (int i = 0; i < array.length; i++) {
			array[i] = rn.nextInt(-10, 10);
		}
		
		System.out.println(Arrays.toString(array));
		System.out.println(findMaxNumber(array));
		
	}
	
	public static int findMaxNumber(int[] arr) {
		
		int maxNumber = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > maxNumber) {
				maxNumber = arr[i];
			}
		}
		
		return maxNumber;
		
	}

}
