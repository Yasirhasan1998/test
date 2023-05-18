package string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Concatenation {
	public static void main(String[] args) {
		String s1 = "hasan";
		String s2 = " indian";
		System.out.println(s1.concat(s2));

		// using StringBuilder class

		StringBuilder a = new StringBuilder("yasir");
		StringBuilder b = new StringBuilder(" hasan");
		StringBuilder h = a.append(b);
		System.out.println(h.toString());

		// using format() method
		String s = String.format("%s%s", s1, s2);
		System.out.println(s);
		
		// using String.join() method
		String n = String.join("",s1, s2);
		System.out.println(n.toString());
		
		//using Collectors.joining() method
		List<String> list= Arrays.asList("ab","bc","bv");
		String l=list.stream().collect(Collectors.joining(","));
		System.out.println(l.toString());

	}
}
