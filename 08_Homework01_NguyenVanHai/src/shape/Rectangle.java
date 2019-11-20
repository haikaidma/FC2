package shape;
import java.util.Scanner;
public class Rectangle implements Shape {
	//khi bao thuoc tinh
	protected double length,width;
	//cai dat cac phuong thuc
	//constructor: ham khoi tao khong doi so
	//gan gia tri mac dinh ban dau cho thuoc tinh cua class
	public   Rectangle() {
		
	}
	
	//constructor: ham khoi tao co doi so
	//truyen tham si ngoai vao thuoc tinh cua class
	public  Rectangle(double l,double w) {
		setLength(l);
		setWidth(w);
		
	}
	public double getLength()
	{
		return length;
	}
	public double getWidth() {
		return width;
	}
	public void setLength(double l) {
		if(l<0)length=0;
		else
			length=l;
	}
	public void setWidth(double w) {
		if(w<0)width=0;
		else
			width=w;
	}
	public void input() {
		Scanner kb= new Scanner(System.in);
		System.out.println("enter length:");
		setLength(kb.nextDouble());
		System.out.println("enter width:");
		setWidth(kb.nextDouble());
	}
@Override
	public double area() 
	{
		return length*width;
	}
	public double perimeter()
	{
		return(length+width)*2;
	}
	public void output() {
		System.out.println("area: "+area());
		System.out.println("perimeter:"+perimeter());
	}
	public static void main(String[] args) {
		Rectangle r1=new Rectangle();
		/*r1.length=2;
		r1.width=8;
		System.out.println(r1.area());
		System.out.println(r1.perimeter());
		
		Rectangle r2=new Rectangle();
		r2.length=5;
		r2.width=7;
		System.out.println(r2.area());
		System.out.println(r2.perimeter());
	
	Rectangle r3=new Rectangle(3,4);
	System.out.println(r3.length);
	System.out.println(r3.width);*/
		r1.input();
		r1.output();
}
}
