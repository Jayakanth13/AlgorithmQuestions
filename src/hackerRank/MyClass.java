package hackerRank;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MyClass {
	int[] ia = new int[1];
	Object oA[] = new Object[1];
	boolean bool;

	public static void main(String[] args) {

		int[][] array2D = new int[][] { { 1 } };
		int re = array2D[0][0];
		System.out.println(re);
		CostMover cm = new CostMover();
		Enthuware.TestClass tc = new Enthuware.TestClass();

		MyClass test = new MyClass();

		System.out.println(test.ia[0] + "  " + test.oA[0] + "  " + test.bool);

		String mStr = "123";
		long m = Long.parseLong(mStr); // 1
		m = (new Long(123)).parseLong(mStr);
		System.out.println(m);
		Long.valueOf(m).longValue();
		MyClass my = new MyClass();
		my.switchString("B");

		int i = 0;
		Object prevObject;
		Collection c = new ArrayList();

		List s1 = new ArrayList();
		s1.add("a");
		s1.add("b");
		s1.add(1, "c"); //acb
		s1.add("b");
		s1.add("c");
		s1.add("d");//acbbcd
		List s2 = new ArrayList(s1.subList(1, 3));//cb
		s1.addAll(s2);
		System.out.println(s1);
		
		String s3="javatpoint"; 
		int start =2;
		int end =3;
		System.out.println("Substring for "+s3+" ("+start+", "+end+" ) : "+s3.substring(start,end));//returns va  

	}

	public void switchString(String input) {
		switch (input) {
		case "a":
			System.out.println("apple");
		case "b":
			System.out.println("bat");
			break;
		case "B":
			System.out.println("big bat");
		default:
			System.out.println("none");
		}

	}

	public void saveObject(List e) {

	}

}
