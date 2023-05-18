package array1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTwoDimention {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();

		// initialization
		for (int i = 0; i < 3; i++) {
			list.add(new ArrayList<>());
		}

		// add element
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				list.get(i).add(s.nextInt());
			}
		}
		System.out.println(list);
	}

}
