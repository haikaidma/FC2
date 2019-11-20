package simply_linked_list;

public class MyLinkedList<E> {
	public class Node
	{
		private E info;
		private Node next;
	
	public Node(E info)
	{
		this.info =info;
		this.next =null;
	}
	
	public Node(E info,Node next)
	{
		this.info=info;
		this.next=null;
	}

	public int info(int i) {
		return 0;
	}
}
	private Node head, tail;
	private int size;
	public MyLinkedList()
	{
		head=tail=null;
		size=0;
	}
	public void addLast(E e) {
		Node p=new Node(e);
		if(size==0)
			head=tail=p;
		else 
		{
			tail.next=p;
			tail=p;
		}
		size++;
	}
	@Override
	public String toString() {
		String s="";
		Node q=head;
		while (q!=null) {
			s=s+q.info+" ";
			q=q.next;
		}
		return s;
	}
	//tinh tong 
	public int sum() {
		Node q=head;
		int s=0;
		while (q!=null) {
			s=s+(Integer)q.info;
			q=q.next;
		}
		return s;
	}
	public int dem() {
		Node q=head;
		int dem=0;
		while(q!=null) {
			if((Integer)q.info%2==0)
				dem++;
			q=q.next;
		}
		return dem;
	}
	public int Nodelast() {
		int k;
		Node r=tail;
		k=(Integer)r.info;
			return k;
	}
	public void Node2() {
		if(size<2)
			System.out.println("khong co gia tri ke cuoi");
		else {
			Node q=head;
			while(q.next!=tail) {
				q=q.next;
				System.out.println(q.info);
			}
		}
	}
	public boolean SNT(int x) {
		if(x<2) {
			return false;}
		else {
		for (int i=2;i<=Math.sqrt((float)(x));i++) {
			if(x%i==0) 
			{
				return false;
					
				}
			}
		}
	return true;
}
	public void tbc() {
		int d =0,S=0;
		double tbc=0;
		Node q=head;
		while (q!=null) {
			if(SNT((Integer)q.info)==true) {
				S+=(Integer)q.info;
				d++;}
			q=q.next;
		}
		tbc=1.0*S/d;
		System.out.println(tbc);
	}
	//dem trong lien ket co bao nhieu gia tri chan
	//tinh cbc cac so nguyen to
	//in  ra gia tri node cuoi
	//in ra cac gia tri cua nut ke cuoi
	public void reverse()
	{
		if(size >= 2)
		{
			Node q = head.next ;
			head.next = q.next ;
			q.next = head ;
			head = q ;
		}
	}
	
	
	
	public void reverse1()
	{
		Node q = head.next;
		if(size >= 2)
		{
			head.next = q.next ;
			q.next = head ;
			if(size == 2) tail = head ;
			head = q ;
		}
	}
	
	
	
	public void reverse2()
	{
		if(size == 2) reverse1();
		if(size >= 2)
		{
			Node q = head ;
			while(q.next != tail) q = q.next ;
			Node r = head ;
			while(r.next != q) r = r.next ;
			r.next = tail ;
			tail.next = q ;
			q.next = null ;
			tail = q ;
		}
	}
	public void reverseAll()
	{
		if(size == 2) reverse1();
		if(size > 2)
		{
			Node q = head.next;
			tail = head ;
			Node r = tail ;
			head = q.next ;
			int i = 1 ;
			while(r.next != null && i != size)
			{
				q.next = r ;
				r = q ;
				q = head ;
				if(head.next != null) head = head.next ;
				i++ ;
			}
			head = r ;
			tail.next = null ;
		}
	}
	public void removenegative()  {
			while((Integer)head.info < 0){
				head = head .next;
				size--;
			}
			while((Integer)tail.info < 0){
				Node r = head;
				while(r.next != tail){
					r = r.next;
				}
				r.next = null;
				tail = r;
				size--;
			}
			Node q = head.next;
			Node r = head;
			while(q!=null){
				if((Integer)q.info<0){
					q = q.next;
					size--;
				}
				else	{
					r.next = q;
					r = q;
					q = q.next;
				}
			}
			tail = r;
		}
	public boolean contains(E element)
	{
		Node q = head ;	
		while(q != null)
		{
			if(q.info == element) return true ;
			q = q.next ;
		}
		return false ;
	}
	public void removeLast()
	{
		Node q = head ;
		while(q != null)
		{
			if(q.next == tail) 
			{
				tail = null ;
				q.next = null ;
				tail = q;
			}
			q = q.next;
		}
	}
	public void addFirst(E element)
	{
		Node e = new Node(element,head);
		head = e;
	}
	public void removeFirst() {
		if(head==null)
			System.out.println("emty");
		else { 
			if(head==tail)
				head=tail=null;
			else
		 head=head.next;
		size--;
		}
		System.out.println(toString());
	}
	public static void main(String[] args) {
		MyLinkedList h= new MyLinkedList<Integer>();
		h.addLast(3);
		h.addLast(6);
		h.addLast(8);
		h.addLast(9);
		h.addLast(2);
		h.addLast(5);
		h.addLast(10);
		h.addLast(5);
		h.addLast(-3);
		System.out.println(h.contains(2));
		System.out.println(h.toString());
		h.removenegative();
		System.out.println(h.toString());
		h.removeFirst();
	}

}
