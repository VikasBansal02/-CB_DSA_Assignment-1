import java.util.*;
public class Main {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Main m = new Main();
		BinaryTree bt = m.new BinaryTree();
		System.out.println(bt.isBalanced());
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

		public boolean isBalanced() {
			return isBalanced(root);
		}

		public boolean isBalanced(Node root) {
			// write your code here
            if(root==null) {
	    		return true;
	    	}
	        boolean left=isBalanced(root.left);
	        boolean right=isBalanced(root.right);
	        boolean isbala=Math.abs(height(root.left)-height(root.right)) <=1;
	        return left && right && isbala;
	    }
	    public int height(Node root) {
	    	if(root==null) {
	    		return -1;
	    	}
	    	int lh=height(root.left);
	    	int rh=height(root.right);
	    	return Math.max(lh, rh)+1;
	    }

		private class BalancedPair {
			int height;
			boolean isBalanced;
		}

	}
}
