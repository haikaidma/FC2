package employee;
import java.util.Scanner;
public abstract class Employee extends Person {
	private String id,position;
	private double allowance;
	
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id=id;
	}
	
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position=position;
	}
	
	public double getAllowance() {
		return allowance;
	}
	public void setAllowance(double allowance) {
		this.allowance=allowance;
	}
	
	public Employee() {
		this.id="";
		this.position="";
	}
	public Employee(String fullName,String phoneNumber,boolean gender,Address add,DayOfBirth dob, String id, String position,double allowance ) {
		super();
		this.setId(id);
		this.setPosition(position);
		this.setAllowance(allowance);
	}
	public abstract double ComputeSalary();
	public void input() {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter ID: ");
		this.setId(kb.nextLine());
		System.out.println("Enter Position:");
		this.setPosition(kb.nextLine());
		System.out.println("Enter Allowance");
		this.setAllowance(kb.nextDouble());
		super.input();
	}
	
	public void output() {
		System.out.println("ID: "+this.id);
		System.out.println("Position: "+this.position);
		System.out.println("Allowance: "+this.allowance);
		super.output();
	}

	public static void main(String[] args) {
		Employee k=new Employee();
		k.input();
		k.output();
	}
}