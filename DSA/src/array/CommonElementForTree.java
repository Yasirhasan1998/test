package array;

import java.util.ArrayList;

public class CommonElementForTree {

	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3, 5, 6 };
		int[] a2 = { 2, 3, 5, 6 ,9};
		int[] a3 = { 1, 2, 3,5, 6,};

		int x = 0, y = 0, z = 0;

		ArrayList<Integer> n = new ArrayList<Integer>();
		while (x < a1.length && y < a2.length && z < a3.length) {
			if (a1[x] == a2[y] && a2[y]==a3[z]) {
				n.add(a1[x]);
				x++;
				y++;
				z++;
			} else if (a1[x] < a2[y]) {
				x++;

			} else if (a2[y] < a3[z]) {
				y++;
			} else {
				z++;
			}
		}
		for (int a : n) {
			System.out.println(a);
		}

	}

}
