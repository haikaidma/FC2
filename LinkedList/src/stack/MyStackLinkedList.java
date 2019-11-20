package stack;

import simply_linked_list.MyLinkedList.Node;

public class MyStackLinkedList<E> {
	public class Node{
		private E info;
		private Node next;
		public Node(E info) 
		{
			this.info=info;
			this.next=null;
		}
		public Node(E info,Node next) 
		{
			this.info=info;
			this.next=next;
		}
	}
		private Node top;
		private int size;
		public MyStackLinkedList() {
			top=null;
			size=0;
	}
		public boolean empty() {
			if(top==null)
				return true;
			else
				return false;
		}
		public E push(E e) {
			Node p = new Node (e);
			if(top==null) {
				top=p;
			}
			else {
				p.next=top;
				top=p;
			}
		size++;
		return e;
		}
		public E peek() {
			if(top==null) {
				System.out.println("Stack is empty");
			return null;
			}
			else
				return top.info;
		}
		public E pop() {
			if(top==null) {
				System.out.println("Stack is empty");
			return null;
			}
			else {
				E tmp = top.info;
			top=top.next;
			size--;
			return tmp;
			}
		}
		@Override
		public String toString() {
			String s=" ";
			Node q= top;
			while(q!=null) {
				s=q.info+" "+ s;
				q=q.next;
			}
			return s;
		}
public boolean containt(E element) {
	Node q = top ;	
	while(q != null)
	{
		if(q.info == element) return true ;
		q = q.next ;
	}
	return false ;
}
public int seach(E e) {
	if(top==null)
		return -1;
	else {
		Node q=top;
		for(int i=1;i<=size;i++)
		{
			if(q.info==e)
				return i;
			q=q.next;
		}
	}
	return -1;
}
	public static void main(String[] args) {
		MyStackLinkedList <Integer> h= new MyStackLinkedList<Integer>();
		h.push(8);
		h.push(1);
		h.push(2);
		h.push(20);
		h.push(15);
		h.push(10);
		System.out.println(h.toString());
		System.out.println(h.containt(8));
		System.out.println(h.seach(15));
	}

}