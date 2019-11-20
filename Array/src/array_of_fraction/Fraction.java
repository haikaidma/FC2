package array_of_fraction;


import java.util.Scanner;

public class Fraction {
	//khai bao thuoc tinh
	private int numerator, denominator;
	//ham khoi tao khong doi so
	public Fraction() {
		numerator=0;
		denominator=1;
	}
	//ham khoi tao co doi so
	public Fraction(int n, int d) {
		setNumerator(n);
		setDenominator(d);
		
	}
	public int getNumerator() {
		return numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	
	public void setNumerator(int n) {
		this.numerator=n;
	}
	public void setDenominator(int d) {
		if(d==0)denominator=d;
		else
			this.denominator=d;
	}
	public void Input() {
		Scanner Input = new Scanner (System.in);
		System.out.println("enter numerator:");
		int n=Input.nextInt();
		setNumerator(n);
		int d;
		
		do
		{
			System.out.println("enter denominator:");
			d=Input.nextInt();
		} 	while(d==0);
			setDenominator(d);
	}
	
	public Fraction plus( Fraction f2) 
	{
		Fraction f3=new Fraction();
		f3.numerator=this.numerator*f2.denominator+this.denominator*f2.numerator;
		f3.denominator=this.denominator*f2.denominator;
		return f3;
	}
	public Fraction Subtraction( Fraction f2) 
	{
		Fraction f3=new Fraction();
		f3.setNumerator(this.getNumerator()*f2.getDenominator()-this.getDenominator()*f2.getNumerator());
		f3.setDenominator(this.getDenominator()*f2.getDenominator());
		return f3;
	}
	public Fraction Multiplication( Fraction f2) 
	{
		Fraction f3=new Fraction();
		f3.setNumerator(this.getNumerator()*f2.getNumerator());
		f3.setDenominator(this.getDenominator()*f2.getDenominator());
		return f3;
	}
	public Fraction Division( Fraction f2) 
	{
		Fraction f3=new Fraction();
		f3.setNumerator(this.getNumerator()*f2.getDenominator());
		f3.setDenominator(this.getDenominator()*f2.getNumerator());
		return f3;
	}
	@Override
	public boolean equals(Object f2) {
		if(this.numerator==((Fraction)f2).numerator&&this.denominator==((Fraction)f2).denominator)
			return true ;
		return false ;
	}
	public double Division1() {
		return 1.0*this.getNumerator()/this.getDenominator();
	}
	public String toString() {
		String s= this.numerator+"/"+this.denominator;
		return s;
	}
	public void output() {
		System.out.println(toString());
	}
	public static void main(String[] args) {

		Fraction f1 = new Fraction(1,2) ;
		System.out.println(f1.toString());
		
		Fraction f2 = new Fraction(3,4) ;
		System.out.println( f2.toString());
		
		Fraction f3 = f1.plus(f2) ;
		System.out.print("ket qua phep cong=") ;
		System.out.println(f3.toString());
		
		Fraction f4 = f1.Subtraction(f2) ;
		System.out.print("ket qua phep tru=") ;
		System.out.println(f4.toString());
		
		Fraction f5 = f1.Multiplication(f2) ;
		System.out.print("ket qua phep nhan=") ;
		System.out.println(f5.toString());
		
		Fraction f6 = f1.Division(f2) ;
		System.out.print("ket qua phep chia=") ;
		System.out.println(f6.toString());
		System.out.println(f1.equals(f2));
	}
}