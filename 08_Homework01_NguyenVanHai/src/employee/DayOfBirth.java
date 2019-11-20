package employee;
import java.util.Scanner;
public class DayOfBirth {
	private int day,month,year;
	public DayOfBirth() {
		this.day=1;
		this.month=1;
		this.year=1900;
	}
	public DayOfBirth(int d,int m,int y) {
		setDay(d);
		setMonth(m);
		setYear(y);
	}
	public int getDay() {
		return this.day;
	}
	public int getMonth() {
		return this.month;
	}
	public int getYear() {
		return this.year;
	}
	public void setMonth(int m) {
		if(m<=0||m>12)month=1;
		else month=m;
	}
	public void setYear(int y) {
		if(y<=0||y>5000)year=1900;
		else year=y;
	}
	public void setDay(int d) {
		if(d<=0||d>numberOfDay())
			day=1;
		else day=d;
		}
	public int numberOfDay() {
		if(month==1||month==3||month==5||month==9||month==11)
		{
			return 31;
		}
		else {
			if(month==4||month==6||month==10||month==12)
				return 30;
			else 
				if(year%4==0&&year%100!=0||year%400==0) 
					return 29;
				else
					return 28;
				}
			}
	public void input() {
		Scanner h=new Scanner(System.in);
		System.out.println("enter year:");
		this.setYear(h.nextInt());
		System.out.println("enter month");
		this.setMonth(h.nextInt());
		System.out.println("enter day:");
		this.setDay(h.nextInt());
	}
	public String toString()
	{
		return this.getDay()+"/"+this.getMonth()+"/"+this.getYear();
	}
	public void output() {
		System.out.println(this.toString());
	}
	public static void main(String[] args) {
		DayOfBirth d= new DayOfBirth();
		d.input();
		d.output();

	}

}
