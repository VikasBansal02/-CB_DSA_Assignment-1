import java.util.*;
public class Main {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Main m = new Main();
		BinaryTree bt1 = m.new BinaryTree();
		System.out.println(bt1.levelArrayList());
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

		public ArrayList<ArrayList<Integer>> levelArrayList() {

			// write your code here
			ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
			Queue<Node> q=new LinkedList<>();
			q.add(root);
			while(!q.isEmpty())
			{
				int size=q.size();
				ArrayList<Integer> ll=new ArrayList<>();
				for(int i=0;i<size;i++)
				{
					Node c=q.poll();
					ll.add(c.data);
					if(c.left!=null)
					{
						q.add(c.left);
					}
					if(c.right!=null)
					{
						q.add(c.right);
					}
				}
				ans.add(ll);
			}
			return ans;

		}

	}

}
