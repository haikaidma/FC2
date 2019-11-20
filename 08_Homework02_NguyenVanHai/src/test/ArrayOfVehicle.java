package test;
import java.util.*;
public class ArrayOfVehicle {
	private Vehicle list[] = new Vehicle[100];
	private int n;
	public void input()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("How many vehicles in the list ? ");
		n = in.nextInt();
		for(int i = 0 ; i < n ; i++)
		{
			System.out.println("Choose vehicle type:\n1.Car\n2.Bicycle");
			int choose = in.nextInt();
			if(choose == 1 )
				list[i] = new Car();
			else if(choose == 2 )
				list[i] = new Bicycle();
			list[i].input();
		}
	}
	public void safetyVehicle()
	{
		int min = 0;
		for(int i = 1 ; i < n ; i++)
			if(list[i].getSpeed() < list[min].getSpeed())
				min = i;
		System.out.println(list[min].go());
	}
	public void output()
	{
		for(int i = 0 ; i < n ; i++)
			System.out.println(list[i].go());
		safetyVehicle();
	}
	public static void main(String[] args) {
		ArrayOfVehicle tmp = new ArrayOfVehicle();
		tmp.input();
		tmp.output();
	}
}

