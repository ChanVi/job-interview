package DataStructure;

import java.util.ArrayList;
import java.util.List;

class Node{
	int element;
	Node left;
	Node right;
	
	public Node(int x){
		this(x, null, null);
	}
	
	public Node(int x, Node lt,Node rt) {
		left = lt;
		right = rt;
		element = x;
	}
}

public class BinaryTreeSearch {
	
	
	
	public static void main(String[] args) {
		int[] data = new int[]{10,2,1,3,9,6,8,5};
		BinaryTreeSearch tree = new BinaryTreeSearch();
		Node root = tree.insert(data);
		tree.printTree(root);
	}
	
	

	public Node insert(int[] x){
		List<Node> list = new ArrayList<Node>();
		for (int i = 0; i < x.length; i++) {
			list.add(new Node(x[i]));
		}
		for (int i = 0; i < x.length/2-1; i++) {
			list.get(i).left = list.get(i*2+1);
			list.get(i).right = list.get(i*2+2);
		}
		int i = x.length/2-1;
		list.get(i).left = list.get(i*2+1);
		if ((x.length&1) == 1) {
			list.get(i).right = list.get(i*2+2);
		}
		return list.get(0);
	}
	
	
	public void printTree(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.element+" ");
		printTree(root.left);
		printTree(root.right);
	}
}
