package Enthuware;

import java.util.ArrayList;
import java.util.List;

public abstract class TestClassArrayList extends Number {

	int i;

	public static void main(String[] args) {
		List<String> c = new ArrayList<String>(); // create an ArrayList, c
		c.add("Oslo"); // add original cities
		c.add("Paris");
		c.add("Rome");
		int index = c.indexOf("Paris"); // find Paris' index
		System.out.println(c + " " + index);
		c.add(index, "London"); // add London before Paris
		System.out.println(c);

		Runnable r = new Thread();
		Boolean b = true;
		new Boolean(b);
		
		boolean b1 = true|false;
		
		System.out.println(b1);

		Short s = 10;
		// char c2 = (char )s;

		int i = 1234567890;
		float f = 1f;
		System.out.println(f);
		
		long y = 123_45_6L;
		float f2 = 123_345_667F;
		
		int i1 = 1, i2 = 2, i3 = 3;
		int i4 = i1 + (i2=i3 );
		System.out.println((i2=i3 ));
		System.out.println("i4 is "+i4);

	}

}
