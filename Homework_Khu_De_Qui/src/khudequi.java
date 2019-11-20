
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class khudequi {
public static String doihe(int n,int k) {
	Stack <Integer> s= new Stack<Integer>();
	String rs = "";
		while(n>0) {
			s.push(n%k);
			n=n/k;
		}
		while(!s.isEmpty()) {
//			rs+= (s.peek() < 10) ? s.pop() : (char)(s.pop() + 55);
			if(s.peek() < 10)
				rs+=s.pop();
			else rs += (char)(s.pop() + 55);
		}
	return rs;
	}
public static long factorical(int n){
	Stack<Integer> s= new Stack<Integer>();
	int sum=1;
	while(n>0) {
		s.push(n);
		n=n-1;
	}
	while(!s.isEmpty()) {
		sum=sum*s.pop();
	}
	return sum;
	}
public static long sum(int n) {
	Stack<Integer> s= new Stack<Integer>();
	int sum=0;
	while(n>0) {
		s.push(n); 	
		n=n-1;
	}
	while(!s.isEmpty()) {
	 sum=sum+s.pop();
	 }
	return sum;
}
public static long sum2(int n) {
	Stack<Integer> s= new Stack<Integer>();
		n=n%2==0?n=n-1:1;
		int sum2=0;
	while(n>0) {
		s.push(n);
		n=n-2;
	}
	while(!s.isEmpty()) {
		sum2=sum2+s.pop();
	}
	return sum2;
}
public static void boiso(int n,int m)
{
	Stack<Integer> huy = new Stack<Integer>();
	while(n > 0)
	{
		huy.push(n-m);
		n-=m;
	}
	if(huy.peek() == 0)
		System.out.println("La boi so cua "+m);
	else System.out.println("Khong la boi so cua "+m);
		
}
	public static int daonguoc(int n) {
		Stack<Integer> s= new Stack<Integer>();
		int t=0;
		while(n>0)
		{
			s.push(n%10);
			n=n/10;
		}
		while(!s.isEmpty()) {
			t = t*10 + s.pop();
		}
		return t;
	}
	public static long mod(int a, int b) {
		Stack<Integer> s= new Stack<Integer>();
		if(a==0||b==0)
			return 0;
		while(a>=b) {
			s.push(a=a-b);
		}
		return a;
	}
	public static long  div(int a, int b) {
		Stack<Integer> s= new Stack<Integer>();
		int dem=0;
		while(a>=b) {
			s.push(a=a-b);
			dem++;
		}
		return dem;
	}
	

	public static long ucln(int a,int b) {
		Stack<Integer> s= new Stack<Integer>();
		if(a==0||b==0) 
			return a+b;
		while(a!=b) {
			if(a>=b)
				s.push(a=a-b);
			else
				s.push(b=b-a);
		}
		return a;
	}
	public static int mu(int n)
	{
		int t= 1;
		Stack<Integer> s = new Stack<Integer>();
		for(int i=0;i<n;i++)
			s.push(2);
		while(!s.isEmpty())
		{
			t=t*s.pop();
		}
		return t;
	}
	public static int mu2(int x,int y)
	{
		if(x == 0)
			return 0;
		if(y == 0)
			return 1;
		int k = 1;
		Stack<Integer> s = new Stack<Integer>();
		for(int i = 0 ; i < y ; i++)
			s.push(x);
		while(!s.isEmpty())
			k*=s.pop();
		return k;
	}
	public static void main(String[] args) {
		System.out.println(ucln(20,60));
		System.out.println(mu(5));
		System.out.println(mu2(6,3));
		boiso(5,15);
	}
}
