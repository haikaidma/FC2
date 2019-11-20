package array_of_double;

public class ArrayOfDouble {
	private int n;
	private double a[];
	public ArrayOfDouble() {
		a=new double [10];
		n=0;
	}
	public ArrayOfDouble(int capcity) {
		a=new double[capcity];
		n=0;
	}
	public void add(double element) {
		if(n==a.length) {
		double[]b=new double[a.length*2];
		for(int i=0;i<n;i++) 
			b[i]=a[i];
		a=b;
		}
	a[n]=element;
	n++; 
	
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
	public boolean contain (double element)
	{
		for(int i =0;i<n;i++) 
			if(a[i]==element)
				return true;
		return false ;
	}
	public int indexOf(double element)
	{
	for(int i=0;i<n;i++)
	
		if(a[i]==element) 
			return i;
	return -1;	
	}
	public void add2(double element,int index) {
		if(index<0||index>n) {
			System.out.println("out of index");
		}
		else 
		{
			if(n==a.length) {
				double[]b=new double [a.length*2];
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
	//lay phan tu tai vi tri index
	public Double get(int index) {
		if(index<0||index>=n) { 
			System.out.println("out of index");
		    return null;
		}
		else
			return  a[index];
		}
	public  String toString() {
		  String s="";
		  for(int i=0;i<n;i++) {
		  s=s+"\n"+a[i];
		  }
		 return s;
	}
	public static void main(String[] args) {
		ArrayOfDouble arr=new ArrayOfDouble();
				arr.add(4.5);
				arr.add(3.5);
				arr.add(4.6);
				arr.add(3.2);
				System.out.println(arr.toString());
				arr.Remove(3);
				System.out.println(arr.toString());
				arr.add2(1.1, 2);
				System.out.println(arr.toString());
				System.out.println(arr.indexOf(-3));
				if(arr.contain(6.3)==true)
					System.out.println("contain");
				else
					System.out.println("not contain");
				System.out.println(arr.get(2));
	}

}
