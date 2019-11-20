package employee;
import java.util.Scanner;
public class Regular extends Employee {
	private int yearOfExperience;
	private double rate,BasicSalary;
	
	public Regular() {
		
	}
	public Regular(String fullName,String phoneNumber,boolean gender,Address add,DayOfBirth dob, String id, String position,double allowance,int yearOfExperience,double rate ,double BasicSalary) {
		super();
		this.setYearOfExperience(yearOfExperience);
		this.setRate();
		this.setBasicSalary(BasicSalary);
	}
	public int getYearOfExperience() {
		return this.yearOfExperience;
	}
	public void setYearOfExperience(int yearOfExperience) {
		this.yearOfExperience=yearOfExperience;
	}
	public double getRate() {
		return this.rate;
	}
	public double getBasicSalary() {
		return this.BasicSalary;
	}
	
	public void setRate() {
		if(this.yearOfExperience > 25)
			this.rate = 2.33 + 8*0.33;
		else this.rate = 2.33 + this.yearOfExperience / 3 *0.33;
	}
	
	public void setBasicSalary(double BasicSalary) {
		this.BasicSalary=BasicSalary;
	}
	public void input() {
		super.input();
		Scanner kb=new Scanner(System.in);
		System.out.println("enter yearOfexperience:");
		this.setYearOfExperience(kb.nextInt());
		setRate();
		System.out.println("enter BasicSalary:");
		this.setBasicSalary(kb.nextDouble());
		
	}
@Override
	public double ComputeSalary() {
		return this.getRate()*this.getBasicSalary();
		}
	public void output() {
		System.out.println("year Of Experience:"+this.getYearOfExperience());
		System.out.println("basicSalary:"+this.getBasicSalary());
		System.out.println(ComputeSalary());
		super.output();
		
	}
	public static void main(String[] args) {
		Regular h=new Regular();
		h.input();
		h.output();
	}
}
