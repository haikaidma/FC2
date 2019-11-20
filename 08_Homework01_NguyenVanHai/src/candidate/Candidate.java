package candidate;

import java.util.Scanner;

public class Candidate {
	private String codeID;
	private String name;
	private DayOfBirth dob=new DayOfBirth();
	private Address add=new Address();
	private int mark1,mark2,mark3;
	
	public String getCodeID(){
		return codeID;
	}
	public void setCodeID(String c) {
		this.codeID=c;
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		this.name=n;
	}
	public DayOfBirth getDob() {
		return dob;
	}
	public void setDob(DayOfBirth dob) {
		this.dob=dob;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add=add;
	}
	public int getMark1() {
		return mark1;
	}
	public void setMark1(int m1) {
		this.mark1=m1; 
	}
	public int getMark2() {
		return mark2;
	}
	public void setMark2(int m2) {
		this.mark2=m2; 
	}
	public int getMark3() {
		return mark3;
	}
	public void setMark3(int m3) {
		this.mark3=m3; 
	}
	public 		Candidate() {
		this.codeID="";
		this.name="";
	}
	public 		Candidate(String c,String n,DayOfBirth dob,Address add,int m1,int m2,int m3) {
		setCodeID(c);
		setName(n);
		setDob(dob);
		setAdd(add);
		setMark1(m1);
		setMark2(m2);
		setMark3(m3);
	}
	public void input() 
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter codeID: ");
		setCodeID(kb.nextLine());
		System.out.println("Enter name: ");
		setName(kb.nextLine());
		System.out.println("Date of birth");
		dob.input();
		System.out.println("Address");
		add.input();
		System.out.println("Enter mark 1:");
		setMark1(kb.nextInt());
		System.out.println("Enter mark 2:");
		setMark2(kb.nextInt());
		System.out.println("Enter mark 3:");
		setMark3(kb.nextInt());
	}
	public void output()
	{
			System.out.println(codeID);
			System.out.println(name);
			dob.output();
			add.output();
			System.out.print(mark1+" ");
			System.out.print(mark2+" ");
			System.out.print(mark3);
			System.out.println();
	}
	public double averageMark()
	{
		return 1.0*(((mark1+mark2)/2)+(mark3*2))/3;
	}
	public int age()
	{
		return 2019-getDob().getYear();	
	}
	public static void main(String[]args)
	{
		Candidate c=new Candidate();
		c.input();
		c.output();
		System.out.println("Average Mark: "+c.averageMark());
		System.out.println("Age: "+c.age());
	
		
	}
}