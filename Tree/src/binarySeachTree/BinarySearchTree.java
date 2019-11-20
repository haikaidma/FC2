package binarySeachTree;
public class BinarySearchTree <E>{
	private class Node<T>{
		private Comparable<E> info;
		private Node<T> left;
		private Node<T> right;
		private int level=1;
		public Node(E info) {
			this.info=(Comparable<E>) info;
			this.left=null;
			this.right=null;
		}
		public Node(E info,Node<T> left,Node<T> right) {
			this.info=(Comparable<E>) info;
			this.left=left;
			this.right=right;
			}
		}
	//private static final int Integer = 0;
	private Node<E> root;
	private void inOrder(Node r) {
		if(r!=null) {
			System.out.print(r.info+" ");
			inOrder(r.left);
			inOrder(r.right);
		}
	}
	public void inOrder() {
		inOrder(root);
	}
	private void midOrder(Node r) {
		if(r!=null) {
			midOrder(r.left);
			System.out.print(r.info+" ");
			midOrder(r.right);
		}
	}
	public void midOrder() {
		midOrder(root);
	}
	private void postOrder(Node r) {
		if(r!=null) {
			postOrder(r.left);
			postOrder(r.right);
			System.out.print(r.info+" ");
		}
	}
	public void postOrder() {
		postOrder(root);
	}

	private Node<E> add(E value,Node r)
	{
		if(r==null)
		{
			r= new Node(value);
			return r;
		}
		else {
			if(((Comparable<E>) value).compareTo((E)r.info)<0)
			{
				r.left=add(value,r.left);
				return r;
			}
			else
			{
				if(((Comparable<E>) value).compareTo((E)r.info)>0)
				{
					r.right=add(value,r.right);
					return r;
				}
				else {
					System.out.println("Da co gia tri trong cay");
					return r;
				}
			}
		}
	}
	public void add(E value) {
		root=add(value,root);
	}
	public boolean Seach(int x ,Node r) {
		if(r==null)
			return false;
		else
			if(r.info.equals(x))
				return true;
			else
				if(r.left!=null)
					return Seach(x,r.left);
				else
					if(r.right!=null)
						return Seach(x,r.right);
		return true;
	}
	public void Seach() {
		System.out.println(Seach(10,root));
	}
	private Node <E> Remove(Comparable <E> x, Node r)
	{
		if(r==null) 
		{
			System.out.println("x is not ");
			return r;
		}
		if(x.compareTo((E) r.info)<0) 
		{
			r.left=Remove(x,r.left);
			return r;
		}
		else 
			if(x.compareTo((E) r.info)<0) 
			{
				r.right=Remove(x,r.right);
				return r;
			}
			else
				if(r.left==null&r.right==null)
				{
					r=null;
					return r;
				}
				else
				
					if(r.left==null)
					{
						r=r.right;
						return r;
					}
			else
			{
				Node p=r.left;
				while(p.right!=null)
					p=p.right;
				r.info=p.info;
				r.left=Remove(p.info,r.left);
				return r;
			}
		}
	public void Remove(Comparable <E> x)
	{
		root=Remove(x,root);
	}
	public static void main(String[] args) {
	BinarySearchTree<Integer> tree= new BinarySearchTree<Integer>();
			tree.add(10);
			tree.add(4);
			tree.add(18);
			tree.add(-4);
			tree.add(8);
			tree.add(15);
			tree.inOrder();
		//t.midOrder();
		//System.out.println();
		//t.postOrder();
//			System.out.println();
//			tree.Seach();
			tree.Remove(10);
			System.out.println();
			tree.inOrder();
			
	}

}
