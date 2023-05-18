package trees;

class TrieNode {
	TrieNode[] child;
	boolean isEndOfWord;

	TrieNode() {
		child = new TrieNode[26];
		isEndOfWord = false;
	}
}

class Trie {
	private TrieNode root;

	Trie() {
		root = new TrieNode();
	}

	public void insert(String word) {
		TrieNode node = root;
		for (char c : word.toCharArray()) {
			int index = c - 'a';
			if (node.child[index] == null) {
				node.child[index] = new TrieNode();
			}
			node = node.child[index];
		}
		node.isEndOfWord = true;
	}

	public boolean search(String word) {
		TrieNode node = root;
		for (char c : word.toCharArray()) {
			int index = c - 'a';
			if (node.child[index] == null) {
				return false;
			}
			node = node.child[index];
		}
		return node.isEndOfWord;
	}
}

public class Tries {
	public static void main(String[] args) {
		Trie n = new Trie();
		n.insert("yasir");
		System.out.println(n.search("yasir"));
		System.out.println(n.search("yas"));
	}

}
