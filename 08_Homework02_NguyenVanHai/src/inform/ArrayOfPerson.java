package inform;
import java.util.Scanner;
public class ArrayOfPerson {
	private int n;
	private Person []a=new Person[100];
public ArrayOfPerson() {
		
	}
	public ArrayOfPerson(int n) {
		this.n=n;
	}
	public int getN() {
		return this.n;
	}
	public void setN(int n) {
		this.n=n;
	}
	public void input() 
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter n: ");
		this.setN(kb.nextInt());
		for(int i=0;i<n;i++) {
			System.out.println("no."+i);
			Person p=new Person();
			p.input();
			a[i]=p;
		}
	}
	public void output() {
		for(int i=0;i<n;i++) {
			a[i].toString();
		}
	}
	public static void main(String[] args) {
		ArrayOfPerson k=new ArrayOfPerson();
		k.input();
		k.output();

	}

}
