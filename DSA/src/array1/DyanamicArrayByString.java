package array1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DyanamicArrayByString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the array nb");
		int size = s.nextInt();

		String arr[] = new String[size];
		System.out.println("enter the name of array(String):");

		for (int i = 0; i < size; i++) {
			arr[i] = s.next();
		}
		System.out.println(Arrays.toString(arr));

		ArrayList<String> al = new ArrayList<String>(Arrays.asList(arr));
		System.out.println("add new elementa:");
		String el = s.next();
		al.add(el);
		arr = al.toArray(arr);
		System.out.println(Arrays.toString(arr));
	}

}
