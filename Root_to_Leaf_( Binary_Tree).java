import java.util.*;
public class Main {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Main m = new Main();
		BinaryTree bt = m.new BinaryTree();
		bt.RTL();
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

		public void RTL() {
			int n=scn.nextInt();
			ArrayList<Integer> ans=new ArrayList<>();
			this.RTL(this.root,n,ans);
		}

		private void RTL(Node root,int targetSum,ArrayList<Integer> ans) {
			// write your code here
			if(root==null)
	    	{
	    		return;
	    	}
	    	if(root.left==null && root.right==null && root.data-targetSum==0)
	    	{
				ans.add(root.data);
	    		for(int i:ans)
				{
					System.out.print(i+" ");
				}
	    	}
			ans.add(root.data);
	    	RTL(root.left,targetSum-root.data,ans);
	    	RTL(root.right,targetSum-root.data,ans);
		}

	}

}
