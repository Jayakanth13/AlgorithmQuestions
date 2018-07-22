package algorithmquestions;

import java.util.*;

public class DuplicateFinder {

	public static void main(String[] args) {
		
		int[][] array2D = new int[][]{{0, 1}};
		
		
		
		 int[] a = { 1, 2, 3, 4 };      
		 int[] b = { 2, 3, 1, 0 };       
		 System.out.println( a [ (a = b)[3] ] );//a [b[3]]a[0]
		
		
		int[] arr = {1, 2}; int[][] arr2 = {arr, {1, 2}, arr}; int[][][] arr3 = {arr2};
		
		int[] arrawy2D[] = new int [2] [2]; 
		arrawy2D[0] [0] = 1; 
		arrawy2D[0] [1] = 2; 
		arrawy2D[1] [0] = 3;

		List<Integer> listNo = new ArrayList<Integer>();
		Random rn = new Random();
		for (int i = 0; i < 100000; i++) {
			listNo.add(rn.nextInt(200000) + 1);

		}
			
		 System.out.println(listNo);
		 
		int noOfDuplicates = duplicateFinder(listNo);
		System.out.println("No of duplicates "+noOfDuplicates);

	}
	
	
	private static int duplicateFinder(List<Integer> listNo) {

		int noOfDuplicates = 0;
		List<Integer> duplicateList = new ArrayList<Integer>();
		Map<Integer, Integer> mapDuplicate = new HashMap<Integer, Integer>();

		for (int i = 0; i < listNo.size(); i++) {

			if (!duplicateList.contains(listNo.get(i))) {
				// if map does not have i key,
				// add to a map and make count 1
				if (!mapDuplicate.containsKey(listNo.get(i))) {
					mapDuplicate.put(listNo.get(i), 1);
				} else {

					// if it contains, the key, means that i is a duplicate, add it to a duplicate
					// list so that you dont check
					duplicateList.add(listNo.get(i));
				}
			}

		}

		noOfDuplicates = duplicateList.size();

		return noOfDuplicates;
	}

}
