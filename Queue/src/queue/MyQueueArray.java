package queue;

public class MyQueueArray<E> {
	private E[] a;
	private int head;
	private int tail;
	private int size;
	public MyQueueArray() {
		a = (E[]) new Object[5];
		head = 0;
		tail = 0;
		size = 0;
			}
	public MyQueueArray(int size) {
		a = (E[]) new Object[size];
		head = 0;
		tail = 0;
		size = 0;
			}
	public boolean add(E e) {
		if (size >= a.length) {
		System.out.println("Queue is full");
					System.exit(0);	
		}
				a[tail++] = e;
				tail = tail % a.length;
				size++;
				return true;
			}
	public boolean offer(E e) {
		if (size >= a.length)
			return false;
			a[tail++] = e;
			tail = tail % a.length;
			size++;
			return true;
			}
	public E remove() {
			if (size <= 0) {
				System.out.println("queue is empty");
				return null;
				}
			else {
				E temp = a[head++];
				head = head % a.length;
				size--;
				return temp;
			}
	}
	public E poll() {
		if (size <= 0)
			return null;
			E temp = a[head++];
			head = head % a.length;
			size--;
			return temp;
			}

	public E element(){
		if (size <= 0){
		System.out.println("queue is empty");
		return null;
				}
		else
		return a[head];
			}
	public E peek() {
		if (size <= 0)
		return null;
		return a[head];
			}
	public boolean isEmpty() {
		return (size <= 0);
			}
	public boolean isFull() {
		return (size == a.length);
			}
	public String toString() {
		String s=" ";
		int i= head;
		for(int c=1;c<=size;c++) {
			s=s+" "+a[i];
			i=(i+1)%a.length;
		}
		return s;
	}
	public static void main(String[] args) {
		
		MyQueueArray<Integer> h = new MyQueueArray<Integer>();
		h.add(6);
		h.add(8);
		h.add(1);
		System.out.println(h);
		h.remove();
		System.out.println(h);
		h.add(100);
		System.out.println(h);
		   }
	}

