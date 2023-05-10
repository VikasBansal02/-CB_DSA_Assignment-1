import java.util.*;

public class Main {

	Scanner sc = new Scanner(System.in);

	public class Node {
		int data;
		Node left;
		Node right;

	}

	private Node root;

	public Main() {
		CreateTree();

	}

	private void CreateTree() {
		// TODO Auto-generated method stub
		Queue<Node> queue = new LinkedList<>();
		int item = sc.nextInt();
		Node n_node = new Node();
		n_node.data = item;
		this.root = n_node;
		queue.add(n_node);
		while (!queue.isEmpty()) {
			Node rv = queue.remove();
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			if (c1 != -1) {
				Node n = new Node();
				n.data = c1;
				rv.left = n;
				queue.add(n);
			}
			if (c2 != -1) {
				Node n = new Node();
				n.data = c2;
				rv.right = n;
				queue.add(n);
			}

		}

	}

	public void Preorder() {
		Preorder(this.root);
		System.out.println();
	}

	private void Preorder(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}

		if (node.left == null && node.right == null) {
			System.out.print(node.data+" ");
			return;
		}
		Preorder(node.left);
		Preorder(node.right);

	}

	public static void main(String[] args) {
		Main lbt = new Main();
		lbt.Preorder();
	}

}
