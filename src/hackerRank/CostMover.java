package hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CostMover {

	public static void main(String[] args) {

		int[] a = { 1, 3, 2, 15, 6, 8 };
		int costMovement = costMover(a);
		System.out.println("Min cost is " + costMovement);

	}

	private static int costMover(int[] a) {

		int costMovement = 0;

		List<Integer> inputList = new ArrayList<Integer>();
		for (int i : a) {
			inputList.add(i);
		}
		// sort array
		Collections.sort(inputList);

		// calculate cost

		while (inputList.size() != 1) {

			int newElement = inputList.get(0) + inputList.get(1);
			costMovement += newElement;
			inputList.remove(0);
			inputList.remove(0);
			inputList.add(0, newElement);
			Collections.sort(inputList);
		}
		
		

		return costMovement;

	}
}