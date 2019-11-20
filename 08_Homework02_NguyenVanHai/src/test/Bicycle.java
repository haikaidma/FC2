package test;

import java.util.Scanner;

public class Bicycle extends Vehicle{
	protected int numberOfWheels;
	public Bicycle()
	{
		super();
	}
	public void setNumberOfWheels(int numberOfWheels)
	{
		if(numberOfWheels < 0 )
			numberOfWheels = 2;
		else this.numberOfWheels = numberOfWheels;
	}
	public int getNumberOfWheels()
	{
		return this.numberOfWheels;
	}
	public String getColor()
	{
		return this.color;
	}
	@Override
	public int getSpeed()
	{
		return this.speed;
	}
	@Override
	public void input()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of wheels, speed and color respectively");
		setNumberOfWheels(in.nextInt());
		setSpeed(in.nextInt());
		changeColor(in.next());
	}
	@Override
	public void changeColor(String color) {
		this.color = color;
	}
	@Override
	public String go() {
		
		return "The "+this.getColor()+" bicycle with "+this.getNumberOfWheels()+" wheels, go with speed = "+this.getSpeed() +"km/h";
	}
	@Override
	public void setSpeed(int speed) {
		if(speed < 0 )
			this.speed = 0;
		else this.speed = speed;
	}


}