import java.util.*;
public class Main {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Main m = new Main();
		int[] pre = takeInput();
		int[] in = takeInput();
		BinaryTree bt = m.new BinaryTree(pre, in);
		bt.display();
	}

	public static int[] takeInput() {
		int n = scn.nextInt();

		int[] rv = new int[n];
		for (int i = 0; i < rv.length; i++) {
			rv[i] = scn.nextInt();
		}

		return rv;
	}

	private class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;
		}

		private Node root;
		private int size;

		public BinaryTree(int[] pre, int[] in) {
			this.root = this.construct(in, 0, pre.length - 1, pre, 0, in.length - 1);
		}

		private Node construct(int[] inorder,int ilo,int ihi,int[]preorder,int plo,int phi) {

			// write your code here
			if(ilo>ihi || plo>phi) {
	    		return null;
	    	}
	    	Node nn=new Node();
			nn.data=preorder[plo];
	    	int idx=search(inorder,ilo,ihi,preorder[plo]);
	    	int net=idx-ilo;
	    	nn.left=construct(inorder,ilo,idx-1,preorder,plo+1,plo+net);
	    	nn.right=construct(inorder,idx+1,ihi,preorder,plo+net+1,phi);
	    	return nn;
		}
		 public int search(int[]in,int si,int ei,int item)
	    {
	    	for(int i=si;i<=ei;i++)
	    	{
	    		if(in[i]==item)
	    		{
	    			return i;
	    		}
	    	}
	    	return -1;
	    }

		public void display() {
			this.display(this.root);
		}

		private void display(Node node) {
			if (node == null) {
				return;
			}

			String str = "";

			if (node.left != null) {
				str += node.left.data;
			} else {
				str += "END";
			}

			str += " => " + node.data + " <= ";

			if (node.right != null) {
				str += node.right.data;
			} else {
				str += "END";
			}

			System.out.println(str);

			this.display(node.left);
			this.display(node.right);
		}

	}

}
