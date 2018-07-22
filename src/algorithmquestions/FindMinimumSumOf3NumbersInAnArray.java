package algorithmquestions;

import java.util.Arrays;
import java.util.List;

public class FindMinimumSumOf3NumbersInAnArray {

	public static void main(String[] args) {

		int[] arr = { 13, 12, -1, 0, 3, 4, 8, 9 };

		int product = findSmallestProduct(arr);
		System.out.println(" Smallest Product " + product);

	}

	private static int findSmallestProduct(int[] arr) {

		int min1 = arr[0];
		int min2 = arr[0];
		int min3 = arr[0];
		int min3Position = 0;

		int position1stMin = 0;
		int position2ndMin = 0;

		int max1 = arr[0];
		int max2 = arr[0];
		int positionMax1 = 0;
		int positionMax2 = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min1) {
				min1 = arr[i];
				position1stMin = i;
			}
		}

		if (0 == position1stMin) {
			min2 = arr[1];
		}

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < min2 && i != position1stMin) {
				min2 = arr[i];
				position2ndMin = i;
			}
		}

		outerloop: for (int i = 0; i < arr.length; i++) {

			if (min3Position != position1stMin && min3Position != position2ndMin) {
				break outerloop;

			} else {
				min3Position++;
			}
		}

		min3 = arr[min3Position];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] <= min3 && i != position1stMin && i != position2ndMin) {

				min3 = arr[i];
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max1) {
				max1 = arr[i];
				positionMax1 = i;
			}
		}

		if (0 == positionMax1) {
			max2 = arr[1];
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max2 && i != positionMax1) {
				max2 = arr[i];
				positionMax2 = i;
			}
		}

	/*	System.out.println("min1 :" + min1);
		System.out.println("min2 :" + min2);
		System.out.println("min3 :" + min3);
		System.out.println("max1 :" + max1);
		System.out.println("max2 :" + max2);*/

		return Math.min(min1 * min2 * min3, min1 * max1 * max2);

	}
}
