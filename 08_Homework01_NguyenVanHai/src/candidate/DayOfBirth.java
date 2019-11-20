package candidate;
import java.util.Scanner;
public class DayOfBirth {
	//khai bao thuoc tinh
	//ham khoi tao khong doi so
	public DayOfBirth() {
		this.day=1;
		this.month=1;
		this.year=1900;
	}
	
	public DayOfBirth(int d,int m, int y)
	{
		setYear(y);
		setMonth(m);
		setDay(d);
	}
	
	public int day,month,year;
	public int getDay()
	{
		return this.day;
	}
	public void setDay(int d)
	{
		if(d<0 || d> numberOfDay())
			this.day=1;
		else 
			this.day=d;
	}
	public int getMonth()
	{
		return this.month;
	}
	public void setMonth(int m)
	{
		if(m<0 && m>12)
			this.month=1;
		else 
			this.month=m;
	}
	public int getYear()
	{
		return this.year;
	}
	public void setYear(int y)
	{
		if(y<1900 || y>5000)
			this.year=1;
		else 
			this.year=y;
	}
	public void input() {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter year :");
		this.setYear(kb.nextInt());
		System.out.println("Enter month :");
		this.setMonth(kb.nextInt());
		System.out.println("Enter day :");
		this.setDay(kb.nextInt());
		
	}
	public void output() {
		System.out.println("DateOfBirth:"+this.day+"/"+this.month+"/"+this.year);
	}
	//cai dat cac phuong thuc
	public int numberOfDay()
	{
		if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
			
			return 31;
	
		else if(month==4 || month==6 || month==9 || month==11)
				return 30;
			else 
			{
				if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
					return 29;
				else 
					return 28;
			}
		
	}
	
		public void nextDay()
		{
		if(day==numberOfDay())
			if(month==12) System.out.println("1/1/"+(++year));
			else System.out.println("1/"+(++month)+"/"+year);
		else System.out.println((++day)+"/"+month+"/"+year);
		}	
			
	/*public void nextDay()
	{
		if(getDay() < numberOfDay())	
			day++ ;
		else 
		{
			if(numberOfDay() == getDay())
			{
						day=1;
						if(getMonth() == 12)
				{
							month = 1;
							year = year + 1;
				}
						else 
							month = month + 1 ;
				}
		}
		
	}
		*/
	public static void main(String[] args) {
		//tao cac doi tuong co gia tri cu the rieng
		/*dayOfBrth d1= new dayOfBrth();
		d1.setYear(2016);
		d1.setMonth(12);
		d1.setDay(31);
		d1.nextDay();
		//System.out.println("Next day : "+d1.getDay()+"/"+d1.getMonth()+"/"+d1.getYear());
		
		dayOfBrth d=new dayOfBrth() ;//ham khoi tao khong doi so
			System.out.println(d.getYear());
			System.out.println(d.getMonth());
			System.out.println(d.getDay());	
		
	
		dayOfBrth d2=new dayOfBrth(31,1,2019) ;//ham khoi tao co doi so
			System.out.println(d2.getYear());
			System.out.println(d2.getMonth());
			System.out.println(d2.getDay())*/
		
			DayOfBirth A=new DayOfBirth();
			A.input();
			A.output();
	
			DayOfBirth B=new DayOfBirth(24,8,2000);
			B.output();
			
			int year=2000;
			int month=8;
			int day=24;
			DayOfBirth dob=new DayOfBirth(year,month,day);
			dob.output();
					
			A=dob;
			System.out.println(A);
			A.output();
		}
	
	
	
}