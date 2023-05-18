package hasing;

import java.util.LinkedList;

public class Chaining {
	int size;
	private LinkedList<Integer>[] table;

	public Chaining(int size) {
		table = new LinkedList[size];
		for (int i = 0; i < size; i++) {
			table[i] = new LinkedList<Integer>();
		}
		this.size = size;

	}

	public void insert(int key, int value) {
		int hash = key % size;
		table[hash].add(value);
	}

	public void delete(int key, int value) {
		int hash = key % size;
		table[hash].remove((Integer) value);
	}

	public boolean search(int key, int value) {
		int hash = key % size;
		return table[hash].contains(value);
	}

	public static void main(String[] args) {
		Chaining c = new Chaining(10);
		c.insert(0, 1);
		c.insert(1, 2);
		c.insert(2, 3);
		c.insert(3, 4);

	}

}
