package algorithmquestions;

import java.util.Arrays;
import java.util.List;

public class FindMinimumSumOf3NumbersInAnArray {

	public static void main(String[] args) {

		int[] arr = { -8, -2, -1, 0, 3, 4, 8, 9 };

		Arrays.sort(arr);
		printArray(arr);
		

		int noOfNegative = 0;
		int noOfPositive = 0;
		int product = 0;

		// int min = findFirst3MinInArray(arr);

		noOfNegative = findTypeOfNo(arr)[0];
		noOfPositive = findTypeOfNo(arr)[1];

		if (noOfNegative == 0) {
			product = findSmallestProduct(arr);
			System.out.println("Case1 Product :" + product);
		}

		if (noOfNegative == 1 || noOfNegative == 2) {
			product = findSmallestProductWithNegativeNumber(arr);
			System.out.println("Case2 " + product);

		}

		if (noOfNegative >= 3) {

			product = findSmallestProductWith3OrMoreNegativeNumber(arr, noOfPositive);
			System.out.println("Case3 " + product);

		}

		System.out.println(product);

	}

	private static List changeToArray(int[] arr) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private static int smallestProduct(int[] arr) {

		  Arrays.sort(arr);
		  
		    if(arr[0] < 0)
		        return arr[0] * max(arr[1] * arr[2], arr[arr.length-1] * arr[arr.length-2]);
		    return arr[0] * arr[1] * arr[2];
		}

	private static int max(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int findFirst3MinInArray(int[] arr) {
		int min1 = arr[0];
		int min2 = arr[0];
		int min3 = arr[0];
		int position1stMin = 0;
		int position2nsMin = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min1) {
				min1 = arr[i];
				position1stMin = i;
			}
		}
		System.out.println(min1);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min2 && i != position1stMin) {
				min2 = arr[i];
				position2nsMin = i;
			}
		}
		System.out.println(min2);
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < min3 && i != position1stMin && i != position2nsMin) {
				min3 = arr[i];
			}
		}

		System.out.println(min3);

		return min2;
	}

	private static int findSmallestProductWith3OrMoreNegativeNumber(int[] arr, int noOfPositive) {
		int min1 = arr[0];
		int position1stMin = 0;
		int position2nsMin = 0;
		int secondProduct = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min1) {
				min1 = arr[i];
				position1stMin = i;
			}
		}
		int[] arr2 = copyArray(arr, position1stMin);

		int min2 = arr2[0];
		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] < min2) {
				min2 = arr2[i];
				position2nsMin = i;
			}
		}

		int[] arr3 = copyArray(arr2, position2nsMin);

		int min3 = arr3[0];
		for (int i = 0; i < arr3.length; i++) {
			if (arr3[i] < min3) {
				min3 = arr3[i];
			}
		}

		int firstMinProduct = min1 * min2 * min3;

		if (noOfPositive > 2) {
			int max1 = 0;
			int max2 = 0;
			int positionMax1 = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] > max1) {
					max1 = arr[j];
					positionMax1 = j;

				}
			}
			int[] arr4 = copyArray(arr, positionMax1);

			for (int j = 0; j < arr4.length; j++) {
				if (arr4[j] > max2) {
					max2 = arr4[j];
				}
			}

			secondProduct = min1 * max1 * max2;

		}

		if (secondProduct < firstMinProduct) {
			return secondProduct;
		}

		return firstMinProduct;

	}

	private static int findSmallestProductWithNegativeNumber(int[] arr) {
		int min1 = arr[0];
		int max1 = arr[0];
		int max2 = arr[0];
		int positionMax1 = 0;
		int position1stMin = 0;

		for (int j = 0; j < arr.length; j++) {
			if (arr[j] < min1) {
				min1 = arr[j];
			}
		}
		System.out.println("Smalles Negative number :" + min1);

		int[] arr2 = copyArray(arr, position1stMin);

		for (int j = 0; j < arr2.length; j++) {
			if (arr2[j] > max1) {
				max1 = arr2[j];
				positionMax1 = j;

			}
		}
		int[] arr3 = copyArray(arr2, positionMax1);

		for (int j = 0; j < arr3.length; j++) {
			if (arr3[j] > max2) {
				max2 = arr3[j];
			}
		}

		return min1 * max1 * max2;
	}

	private static int findSmallestProduct(int[] arr) {

		int min1 = arr[0];
		int position1stMin = 0;
		int position2nsMin = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min1) {
				min1 = arr[i];
				position1stMin = i;
			}
		}
		int[] arr2 = copyArray(arr, position1stMin);

		printArray(arr2);
		System.out.println();
		System.out.println("min1 :" + min1);

		int min2 = arr2[0];
		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] < min2) {
				min2 = arr2[i];
				position2nsMin = i;
			}
		}

		int[] arr3 = copyArray(arr2, position2nsMin);

		int min3 = arr3[0];
		for (int i = 0; i < arr3.length; i++) {
			if (arr3[i] < min3) {
				min3 = arr3[i];
			}
		}

		System.out.println("min2 :" + min2);
		System.out.println("Pos1 :" + position1stMin + " Pos2 :" + position2nsMin);
		System.out.println("min3 " + min3);

		return min1 * min2 * min3;
	}

	private static int[] copyArray(int[] arr, int position1stMin) {
		int arr2[] = new int[arr.length - 1];

		int j = 0;

		for (int i = 0; i < arr.length; i++) {
			if (i == position1stMin) {
				continue;
			}
			arr2[j] = arr[i];
			j++;
		}
		return arr2;
	}

	private static void printArray(int[] arr2) {
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(" " + arr2[i]);

		}

	}

	private static int[] findTypeOfNo(int[] arr) {
		int noOfNegative = 0;
		int noOfPositive = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				noOfNegative++;
			}
			if (arr[i] > 0) {
				noOfPositive++;
			}
		}

		int[] typesOfNumbers = new int[2];
		typesOfNumbers[0] = noOfNegative;
		typesOfNumbers[1] = noOfPositive;

		return typesOfNumbers;
	}

}
