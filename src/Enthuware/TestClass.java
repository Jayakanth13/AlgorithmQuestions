package Enthuware;

public class TestClass {
	public void testRefs(String str, StringBuilder sb) {
		str = str + sb.toString();
		sb.append(str);
		str = null;
		sb = null;
	}

	public static void main(String[] args) {
		String s = "aaa";
		StringBuilder sb = new StringBuilder("bbb");
		new TestClass().testRefs(s, sb);
		System.out.println("s=" + s + " sb=" + sb);

		boolean b1 = false;
		int i1 = 2;
		int i2 = 3;
		if (b1 = i1 == i2) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		String str1 = "one";
		String str2 = "two";
		System.out.println(str1.equals(str1 = str2));

		Object t = new Integer(106);
		int k = ((Integer) t).intValue() / 10;
		System.out.println(k);
		System.out.println(100 / 9.9);
		System.out.println(100 / 10.0);
		System.out.println(100 / 10);
		System.out.println(3 + 100 / 10 * 2 - 13);

		System.out.println('a' + 1);
		System.out.println(5/4); 
		System.out.println("1" + 2 + 3);
		System.out.println(1 + 2 + "3"); 
		
		System.out.println("a"+'b'+63);
		System.out.println('b'+new Integer(63));
		
		
		int a = 1 + 2 + 3 * 4; 
		int b = 2 * 3 + 4;
		
		int total = a + b;
		System.out.println("Total is "+ total);
		
		
		int [] arr1 = new int[0];
		int length =arr1.length;
		System.out.println(length);
		
		
		

	}
}