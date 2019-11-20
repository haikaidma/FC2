package test;

import java.util.Scanner;
public class Car extends Vehicle{
	protected int sizeOfEngine,numberOfDoors;
	public Car()
	{
		super();
	}
	public void setSizeOfEngine(int sizeOfEngine)
	{
		if(sizeOfEngine < 0)
			this.sizeOfEngine = 1;
		else this.sizeOfEngine = sizeOfEngine;
	}
	public int getSizeOfEngine()
	{
		return this.sizeOfEngine;
	}
	public void setNumberOfDoors(int numberOfDoors)
	{
		if(numberOfDoors < 0)
			this.numberOfDoors = 1;
		else this.numberOfDoors = numberOfDoors;
	}
	public int getNumberOfDoors()
	{
		return this.numberOfDoors;
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
		System.out.println("Enter the size of engine, number of doors, speed and color respectively");
		setSizeOfEngine(in.nextInt());
		setNumberOfDoors(in.nextInt());
		setSpeed(in.nextInt());
		changeColor(in.next());
	}
	@Override
	public void changeColor(String color) {
		this.color = color;
	}
	@Override
	public String go() {
		
		return "The "+this.getColor()+" car with "+this.getNumberOfDoors()+" doors and "+this.getSizeOfEngine()+" engine, go with speed = "+this.getSpeed() +" km/h";
	}
	@Override
	public void setSpeed(int speed) {
		if(speed < 0 )
			this.speed = 0;
		else this.speed = speed;
	}
	
}