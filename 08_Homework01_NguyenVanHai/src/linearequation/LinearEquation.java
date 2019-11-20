package linearequation;
import java.util.Scanner;
public class LinearEquation {
	//khai bao thuoc tinh
	private double b,c;
	public LinearEquation() {
		
	}
	public LinearEquation (double bbb,double ccc){
		setB(bbb);
		setC(ccc);
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}
	public void setB(double bb) {
		b=bb;
	}
	public void setC(double cc) {
		c=cc;		
	}
	public void input()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter b : ");
		setB(in.nextDouble());
		System.out.println("Enter c : ");
		setC(in.nextDouble());
	}
	//cai dat cac phuong thuc
	public void solve() {
		if(b==0)
		{
			if(c==0)
			System.out.println("unlimitrd roots");
			else
				System.out.println("no root");
		}
		else
			System.out.println("x="+-c/b);
	}
	public void f(int a,int b) {
		System.out.println(a+b);
	}
	public void f1(double a,double b) {
		System.out.println(a+b);
	}
	public void f2(int a,int b,int c) {
		System.out.println(a+b+c);
	}
public static void main(String[] args) {
	//tap cac doi tuong co gia tri rieng biet
	LinearEquation l1=new LinearEquation();
		l1.b=5;
		l1.c=10;
	System.out.println("giai phuong trinh bac nhat bx+c=0");
		l1.solve();
	LinearEquation l2=new LinearEquation();
		l2.b=0;
		l2.c=0;
		l2.solve();
	LinearEquation l3=new LinearEquation();
		l3.b=0;
		l3.c=6;
		l3.solve();
LinearEquation l4=new LinearEquation();
	l4.input();
	l4.solve();
}
}
