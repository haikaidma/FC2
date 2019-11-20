package arraylist;

import array_of_fraction.ArrayOfFraction;
import array_of_fraction.Fraction;

public class MyArrayList <E>{
	private E[]a;
	private int n;
public MyArrayList() {
	a=(E[])new Object[10];
	n=0;
}
public MyArrayList(int capacity) {
	a=(E[])new Object[capacity];
	n=0;
}
public void add(E element) {
	if(n==a.length) {
		E[]b=(E[])new Object[a.length*2];
	for(int i=0;i<n;i++) 
		b[i]=a[i];
	
	a=b;
	}
a[n]=element;
n++; 
}

/*public void input() {
	Scanner c=new Scanner(System.in);
	System.out.println("nhap n:");
	this.n=(c.nextInt());
	for(int i=0;i<n;i++) {
		System.out.println("element :");
		a[i]=c.nextInt();
	}
}*/
public void output() {
		System.out.println(toString());
	}

public void Remove(int index) {
	if(index<0||index>n)
	{
		System.out.println("out index");
	}
	if(n==0)
	{
		System.out.println("empty");
	}
	else {
	for(int i=index;i<n-1;i++){
		a[i]=a[i+1];
	}
	n--;
}
	}
public boolean contain (E element)
{
	for(int i =0;i<n;i++) 
		if(a[i].equals(element))
			return true;
	return false ;
}
public int indexOf(E element)
{
for(int i=0;i<n;i++)

	if(a[i].equals(element)) 
		return i;
return -1;	
}
public void add2(E element,int index) {
	if(index<0||index>n) {
		System.out.println("out of index");
	}
	else 
	{
		if(n==a.length) {
			E[]b=(E[])new Object[a.length*2];
			System.arraycopy(a,0,b,0,n);
			
			a=b;
			}
	}
	for(int i=n;i>=index;i--) {
		a[i]=a[i-1];
		a[index]=element;
	}
	n++;
}
/*public int size() {
	
}*/
//lay ve phan tu tai vi tri index
public E get(int index) {
	if(index<0||index>=n) { 
		System.out.println("out of index");
	return null;
	}
	else
		return a[index];
}
public String toString() {
	String s="";
	for(int i=0;i<n;i++)
		s=s+" "+a[i];
	return s;
}
public static void main(String[] args) 
{//goi lop khuon mau Myarraylist dua doi tuong integer vao
	MyArrayList<Integer>arr1= new MyArrayList<Integer>();
	arr1.add(3);
	arr1.add(6);
	arr1.add(9);
	System.out.println(arr1.toString());
	//doi tuong fraction
	MyArrayList<Fraction>arr2= new MyArrayList<Fraction>();
	arr2.add(new Fraction (3,4));
	arr2.add(new Fraction(5,6));
	arr2.add(new Fraction(9,6));
	System.out.println(arr2.toString());
}
}
