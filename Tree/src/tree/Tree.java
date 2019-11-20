package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Tree <E> {
	private class Node{
	private int info;
	private Node left,right;
	private int level =1;
	public Node(int info) {
		this.info=info;
		this.left=this.right=null;
	}
	public Node(int info,Node l,Node r) {
		this.info=info;
		this.left=l;
		this.right=r;
	}
}
	private Node Root;
	public Tree() {
		Node r4= new Node(7);
		Node r2= new Node(4,r4,null);
		Node r7= new Node(2);
		Node r8= new Node(5);
		Node r6= new Node(10,r7,r8);
		Node r5= new Node(8);
		Node r3=new Node(1,r5,r6);
		Root = new Node(3,r2,r3);
	}
	private void inOrder(Node r) {
		if(r!= null) {
			System.out.print(r.info+" ");
			inOrder(r.left);
			inOrder(r.right);
		}
	}
	public void inOrder() {
		inOrder(Root);
	}
	private void midOrder(Node r) {
		if(r!=null) {
			midOrder(r.left);
			System.out.print(r.info+" ");
			midOrder(r.right);
		}
	}
	public void midOrder() {
		midOrder(Root);
	}
	public void postOrder(Node r) {
		if(r!=null) {
		postOrder(r.left);
		postOrder(r.right);
		System.out.print(r.info+" ");
	}
		}
	public void postOrder() {
		postOrder(Root);}
	public int sum(Node r) {
		if(r==null) 
			return 0;
		else
			return r.info+sum(r.left)+sum(r.right);
	}
	public void sum() {
		System.out.println("sum"+sum(Root));
	}
	public int sum2(Node r) {
		if(r==null)
			return 0;
		else
			return (r.info%2==0)?r.info:0 + sum2(r.left) + sum2(r.right);
}
	public void sum2() {
		System.out.println(sum2(Root));
	}
	public int count(Node r) {
		int dem=1;
		if(r==null) 
			return 0;
		else
			return dem+count(r.left)+count(r.right);
	}
	public void count() {
		System.out.println(count(Root));
	}
	public int countB1 (Node r){
	   if (r==null) return 0;
	   else
		   if((r.right==null&&r.left!=null)||(r.right!=null&&r.left==null))
	            return 1+countB1(r.left)+countB1(r.right);
	       else 
	            return countB1(r.left)+countB1(r.right);
	    }
	public void countB1(){
	       System.out.println(countB1(Root));
	    }
	public int countB2(Node r){
		if(r==null) 
			return 0;
	     else
	         if(r.left==null||r.right==null)
	               return countB2(r.left)+countB2(r.right);
	         else
	               return 1+ countB2(r.left)+countB2(r.right);
	    }
	public void countB2(){
	   System.out.println(countB2(Root));
	    }
	public int countLa(Node r) {
		if(r==null)
			return 0;
		else
			if(r.left==null&&r.right==null)
				return 1+countLa(r.left)+countLa(r.right);
			else
				return countLa(r.left)+countLa(r.right);
	}
	public void countLa() {
		System.out.println(countLa(Root));
	}
	public int countLe(Node r) {
		if(r==null)
			return 0;
		else
			if(r.info%2!=0) 
				return 1+countLe(r.left)+countLe(r.right);
			else
				return countLe(r.left)+countLe(r.right);
			
	}
	public void countLe() {
		System.out.println(countLe(Root));
	}
	public boolean kiemtra(int x) {
		if(x==1)
			return false;
		for(int i=2;i<x/2;i++)
			if(x%i==0)
			return false;
			return true;
	}
    static int dem =0;

	public int average(Node r) {
      if (r == null)
    	  return 0;
      else 
    	  if (kiemtra((int) r.info))
    	  {
    		  dem++;
    		  return (int) r.info + average(r.left) + average(r.right);}
    		else
      		  return average(r.left) + average(r.right);
      		  
      
}
	public void average(){
		System.out.println((1.0)*average(Root)/dem);
		    }
	public int seach(Node r,int x) {
		if(r==null)
			return 0;
		else
			if((int)r.info==x) 
				return 1;
			else
				return seach( r.left,x)+seach(r.right,x);
		
	}
	public void seach() {
		if(seach(Root,6)==1)
		System.out.println("true");
		else
			System.out.println("false");
	}
	public int heigh(Node r) {
		if(r==null)
			return 0;
		else
			return 1+Math.max(heigh(r.left),heigh(r.right)); 
//			if(max(r.left)>max(r.right))
//			return 1+max(r.left);
//			else
//			return 1+max(r.right);
	}
	public void heigh() {
		System.out.println(heigh(Root));
	}
	public void chieurong() {
	if(Root!=null) {
		Queue<Node> q=new LinkedList<Node>();
		q.add(Root);
		while(!q.isEmpty()) {
			Node p=q.remove();
			System.out.println(p.info);
			if(p.left!=null)
				q.add(p.left);
			if(p.right!=null)
				q.add(p.right);
		}
		
	}
}
	public void chieusau()
	{
		if(Root!= null)
		{	
			Stack<Node> s = new Stack<Node>();
			s.push(Root);
			while(!s.isEmpty())
			{
				Node p = s.pop();
				System.out.println(p.info);
				if(p.left!= null)
					s.push(p.left);
				if(p.right!= null)
					s.push(p.right);
			}
		}
	}
	public void muc(int x) {
		if(Root!=null) {
			Queue<Node> q=new LinkedList<Node>();
			q.add(Root);
			while(!q.isEmpty()) {
				Node p=q.remove();
				if(p.info==x)
				System.out.println(p.level);
				if(p.left!=null) 
				{
					p.left.level=p.level+1;
				q.add(p.left);}
				if(p.right!=null)
				{
					p.right.level=p.level+1;
				q.add(p.right);}
			}
			
		}
		}
	private boolean MaxRoot(Node r)
	{
		int max=(int)Root.info;
		if(max<r.info)
			return false;
		if(r.left!=null)
			return MaxRoot(r.left);
		if(r.right!=null)
			return MaxRoot(r.left);
		return true;
//		if(r != null)
//		{
//			Queue<Node> q = new LinkedList<Node>();
//			q.add(Root);
//			int max = (int)Root.info;
//			while(!q.isEmpty())
//			{
//				Node p = q.remove();
//				if((int)p.info > max)
//					return false;
//				if(p.left != null) 
//					q.add(p.left);
//				if(p.right != null) 
//					q.add(p.right);
//			}
//			return true;
//		}
//		else 
//			return false;
	}
	public void MaxRoot()
	{
		System.out.println(MaxRoot(Root));
	}
	public int max2()
	{	
		int max = (int)Root.info;
		if(Root!= null)
		{
			Queue<Node> q = new LinkedList<Node>();
			q.add(Root);
			while(!q.isEmpty())
			{
				Node p = q.remove();
				if((int)p.info>max)
					max = (int)p.info;
				if(p.left!=null)
					q.add(p.left);
				if(p.right!=null)
					q.add(p.right);
				
			}
		}
		return max;
	}
	public void max() {
	if(Root!= null)
	{
		int max = max2();
		Queue<Node> q = new LinkedList<Node>();
		q.add(Root);
		while(!q.isEmpty())
		{
			Node p = q.remove();
			if((int)p.info == max)
				System.out.print("Level : "+p.level);
			if(p.left != null )
			{
				p.left.level = p.level + 1;
				q.add(p.left);
			}
				
			if(p.right != null )
			{
				p.right.level = p.level + 1;
				q.add(p.right);
			}
				
		}
	}
}
	private int countMax(Node r)
	{
		if(r != null)
		{
			Queue<Node> q = new LinkedList<Node>();
			q.add(r);
			int count = 0 ;
			while(!q.isEmpty())
			{
				Node p = q.poll();
				if(p.left != null) 
				{
					q.add(p.left);
					if((int)p.left.info == max2()) 
						count++;
				}
				if(p.right != null)
				{
					q.add(p.right);
					if((int)p.right.info == max2()) 
						count++;
				}
			}
			return count;
		}
		return 0;
	}
	public void countMax()
	{
		System.out.println("Count Max : "+countMax(Root));
	}

	public static void main(String [] args) {
		Tree t= new Tree();
		t.inOrder();
		System.out.println();
		t.midOrder();
		System.out.println();
		t.postOrder();
		System.out.println();
		//tong so chan
		t.sum2();
		//dem not
		t.count();
		//dem not bac=1
		t.countB1();
		//dem not bac =2
		t.countB2();
		// de not la
		t.countLa();
		//dem cac nut co so le
		t.countLe();
		t.average();
		t.seach();
		t.heigh();
		t.muc(3);
		t.MaxRoot();
		t.max();
		System.out.println(" max: "+t.max2());
		t.countMax();
	}
}