package Enthuware;

public class InitClass {

	public static void main(String[] args) {
		InitClass obj = new InitClass(5);

		float f = -123;
		System.out.println("float f is " + f);
		float f1 = 123;
		System.out.println(f1);

		System.out.println(Boolean.parseBoolean("true"));
		System.out.println(new Boolean(null));
		// System.out.println(new Boolean());
		System.out.println(new Boolean("true"));
		System.out.println(new Boolean("trUE"));

		int c = 10;
		System.out.println(Integer.toBinaryString(c));
		int c1 = -c;
		System.out.println(Integer.toBinaryString(c1));
		System.out.println(c1);

		int a = Integer.MIN_VALUE;
		int b = -a;
		System.out.println(a + "   " + b);

	}

	int m;
	static int i1 = 5;
	static int i2;
	int j = 100;
	int x;

	char ch = (char) 30L;

	public InitClass(int m) {

		System.out.println(i1 + "  " + i2 + "   " + x + "  " + j + "  " + m);

	}

	{
		j = 30;
		i2 = 40;
	} // Instance Initializer
	static {
		i1++;
	} // Static Initializer
}