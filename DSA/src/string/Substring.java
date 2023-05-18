package string;

import java.util.Arrays;

public class Substring {

	public static void main(String[] args) {
		//substring() method
		String s="yasirhasan";
		
		System.out.println(s.substring(3));
		System.out.println("Substring starting from index 2 to 5: "+s.substring(2,5));
		
		//Using String.split() method:
		String text=new String("my name is yasir");
		
		String[] s1=text.split("\\.");
		System.out.println(Arrays.toString(s1));

	}

}
