package trees;

class Node {
	int data;
	Node left;
	Node right;
}

class Bst {

	public Node insert(Node node, int val) {
		if (node == null) {
			return createNewNode(val);
		}
		//here recursive function  call
		if(val<node.data) {
			node.left = insert(node.left, val);
		}else {
			node.right = insert(node.right, val);
		}
		return node;
	}

	private Node createNewNode(int k) {
		Node n = new Node();
		n.data = k;
		n.left = null;
		n.right = null;
		return n;
	}
	
}

public class BinarySearchTree {

	public static void main(String[] args) {
		Bst a = new Bst();
		Node root = null;
		// 8 3 6 10 4 7 1 14 13
		root=a.insert(root, 8);
		root=a.insert(root, 3);
		root=a.insert(root, 6);
		root=a.insert(root, 10);
		root=a.insert(root, 4);
		root=a.insert(root, 7);
		root=a.insert(root, 1);
		root=a.insert(root, 14);
		root=a.insert(root, 13);
		root=a.insert(root, 15);
		printInorder(root);
	}
	public static void printInorder(Node node) {
	    if (node == null)
	        return;

	    printInorder(node.left);
	    System.out.print(node.data + " ");
	    printInorder(node.right);
	}

}
