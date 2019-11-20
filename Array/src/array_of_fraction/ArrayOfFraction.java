package array_of_fraction;

import java.util.Scanner;

public class ArrayOfFraction {
	private int n;
	private Fraction a[];
	//constructor
	public ArrayOfFraction() {
		a=new Fraction[10];
		n=0;
	}
	public ArrayOfFraction(int capacity) {
		a=new Fraction[capacity];
		n=0;
	}
	public void add(Fraction element) {
		if(n==a.length) {
		Fraction[]b=new Fraction[a.length*2];
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
	public boolean contain (Fraction element)
	{
		for(int i =0;i<n;i++) 
			if(a[i]==element)
				return true;
		return false ;
	}
	public int indexOf(Fraction element)
	{
	for(int i=0;i<n;i++)
	
		if(a[i]==element) 
			return i;
	return -1;	
	}
	public void add2(Fraction element,int index) {
		if(index<0||index>n) {
			System.out.println("out of index");
		}
		else 
		{
			if(n==a.length) {
				Fraction[]b=new Fraction[a.length*2];
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
	public Fraction get(int index) {
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
	public static void main(String[] args) {
		ArrayOfFraction k= new ArrayOfFraction();
		k.add(new Fraction (3,4));
		k.add(new Fraction (2,6));
		k.add(new Fraction (9,4));
		k.add(new Fraction (1,4));
		k.output();
		k.Remove(3);
		k.output();
		
		
	}

}
