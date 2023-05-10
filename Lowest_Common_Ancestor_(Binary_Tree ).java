import java.util.*;
public class Main {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Main m = new Main();
		BinaryTree bt = m.new BinaryTree();
		bt.takepq();
		bt.LCA();
	}

	private class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;
		}

		private Node root;
		private int size;
		Node p=new Node();
		Node q=new Node();
		public BinaryTree() {
			this.root = this.takeInput(null, false);
		}
		public void takepq()
		{
			p.data=scn.nextInt();
			q.data=scn.nextInt();
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

		public void LCA() {
			Node ans=this.LCA(this.root,p,q);
			System.out.println(ans.data);
		}

		private Node LCA(Node root,Node p,Node q) {
			// write your code here
			if(root==null)
	    	{
	    		return root;
	    	}
	    	if(root.data==p.data || root.data==q.data)
	    	{
	    		return root;
	    	}
	        Node left=LCA(root.left,p,q);
	        Node right=LCA(root.right,p,q);
	        if(left!=null && right !=null) {
	        	return root;
	        }
	        else if(left!=null) {
	        	return left;
	        }
	        else
	        {
	        	return right;
	        }
		}
			

	}

}
