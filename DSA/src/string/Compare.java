package string;

import java.util.ArrayList;

//There are three ways to compare String in Java:
//
//By Using equals() Method
//By Using == Operator
//By compareTo() Method

public class Compare {

	public static void main(String[] args) {
		// By Using equals() Method
		String s = "yasir";
		String s1 = "yasir";
		String s3 = new String("hasan");
		String s4 = "Yasir";

		System.out.println(s.equals(s3));
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s4));
		System.out.println(s.equals(s4));
		if (s.equals(s4))
			System.out.println("both string are equal: ");
		else
			System.out.println("both string are not equal");

		String r = "nitin";
		ArrayList<String> list = new ArrayList<>();
		list.add("raavi");
		list.add("mukersh");
		list.add("nitin");
		for (String l : list) {
			if (l.equals(r)) {
				System.out.println("nitin are present: ");
			} 
		}

		System.out.println("---------------");
		// By Using == Operator
		String a = "hasan";
		String a1 = "hasan";
		String a3 = "yasir";
		String a4 = new String("hasan");// false becouse a4 instance is non pool
		System.out.println(a == a1);
		System.out.println(a1 == a3);
		System.out.println(a1 == a4);

		System.out.println("-----------------");

		// By compareTo() Method
		String b1 = "hasan";
		String b2 = "hasan";
		String b3 = "Yasir";
		System.out.println(b1.compareTo(b2));// b1==b2
		System.out.println(b1.compareTo(b3));// b1>b3
		System.out.println(b3.compareTo(b1));// b1<b3
		String c1 = "hello";
		String c2 = "";
		String c3 = "me";
		System.out.println(c1.compareTo(c2));
		System.out.println(c2.compareTo(c3));

		// input string in uppercase
		String st1 = new String("INDIA IS MY COUNTRY");

		// input string in lowercase
		String st2 = new String("india is my country");

		System.out.println(st1.compareTo(st2));

		String d1 = "hello";
		String d2 = "hello";
		String d3 = "meklo";
		String d4 = "hemlo";
		String d5 = "flag";
		System.out.println(d1.compareTo(d2));// 0 because both are equal
		System.out.println(d1.compareTo(d3));// -5 because "h" is 5 times lower than "m"
		System.out.println(d1.compareTo(d4));// -1 because "l" is 1 times lower than "m"
		System.out.println(d1.compareTo(d5));// 2 because "h" is 2 times greater than "f"
	}

}
