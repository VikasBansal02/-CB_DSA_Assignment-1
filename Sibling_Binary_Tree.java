import java.util.*;
public class Main {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Main m = new Main();
		BinaryTree bt = m.new BinaryTree();
		bt.sibling();
	}

	private class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;
		}

		private Node root;
		private int size;

		public BinaryTree() {
			this.root = this.takeInput(null, false);
		}

		public Node takeInput(Node parent, boolean ilc) {

			int cdata = scn.nextInt();
			Node child = new Node();
			child.data = cdata;
			this.size++;

			// left
			boolean hlc = scn.nextBoolean();

			if (hlc) {
				child.left = this.takeInput(child, true);
			}

			// right
			boolean hrc = scn.nextBoolean();

			if (hrc) {
				child.right = this.takeInput(child, false);
			}

			// return
			return child;
		}

		public void sibling() {
			this.sibling(this.root);
		}

		private void sibling(Node root) {
			// write your code here
			if(root==null) return;
			if(root.left!=null && root.right==null) 
			{
				System.out.print(root.left.data+" ");
			}
			if(root.right!=null && root.left==null) 
			{
				System.out.print(root.right.data+" ");
			}
			sibling(root.left);
			sibling(root.right);
		}

	}

}
