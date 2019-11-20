package test;

public abstract class Vehicle {
	protected String color;
	protected int speed;
	public abstract void setSpeed(int speed);
	public abstract void changeColor(String color);
	public abstract String go();
	public Vehicle()
	{
		this.color = "";
	}
	public abstract void input();
	public abstract int getSpeed();
}
