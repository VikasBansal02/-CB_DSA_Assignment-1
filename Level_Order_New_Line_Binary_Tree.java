import java.util.*;
public class Main {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Main m = new Main();
		BinaryTree bt = m.new BinaryTree();
		bt.levelOrderNewLine();
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

		public void levelOrderNewLine() {

			// write your code here
			Queue<Node> q=new LinkedList<>();
			q.add(root);
			while(!q.isEmpty())
			{
				int size=q.size();
				ArrayList<Integer> ans=new ArrayList<>();
				for(int i=0;i<size;i++)
				{
					Node c=q.poll();
					ans.add(c.data);
					if(c.left!=null)
					{
						q.add(c.left);
					}
					if(c.right!=null)
					{
						q.add(c.right);
					}
				}
				for(int i :ans)
				{
					System.out.print(i+" ");
				}
				System.out.println();
			}
		}

	}

}
