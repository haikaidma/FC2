package queue;

public class MyQueueList<E> {
private static class Node<T> {
	private T info;
	private Node<T> next;
	public Node(T i, Node<T> n) {
		info = i;
		next = n;
				}
		}
	private Node<E> head;
	private Node<E> tail;
	private int size;
	public MyQueueList() {
		head = tail = null;
		size = 0;
			}
	public boolean add(E e) {
		Node<E> temp = new Node<E>(e, null);
		if (tail == null)
			head = temp;
		else
			tail.next = temp;
			tail = temp;
			size++;
		return true;
			}
	public boolean offer(E e){
		return add(e);
			}
	public E remove(){
		if(size<=0){
			System.out.println("Queue is full");
			System.exit(0);
				}
		E temp=head.info;
		head=head.next;
		size--;
		return temp;
	}
	public E poll(){
		if(size<=0) return null;
		E temp=head.info;
			head=head.next;
			size--;
		return temp;
			}
	public E element() {
		if (size <= 0){
			System.out.println("Queue is empty");
			System.exit(0);
				}
		return head.info;
			}
	public E peek() {
		if (size <= 0)
		return null;
		return head.info;
			}
	public boolean isEmpty() {
		return (size <= 0);
			}
	public String toString() {
			String s=" ";
			Node q=head;
			while(q!=null) {
				s=s+" "+q.info;
				q=q.next;
			}
			return s;
		}
		public static void main(String arg[]) {

			MyQueueList<Integer> h = new MyQueueList<Integer>();
			h.add(6);
			h.add(3);
			h.add(1);
			System.out.println(h.toString());
			h.remove();
			System.out.println(h);
		}
		  }
