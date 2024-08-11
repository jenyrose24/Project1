package Oops;
//method overriding using annotations

class Car
{
	public void speed()
	{
		System.out.println("Car speed");
	}
	public void power()
	{
		System.out.println("Car power");
	}
}
class Bmw extends Car
{

	@Override						//annotation to get the methods of parent class automatically
	public void speed() {
	System.out.println("Bmw speed");
	super.speed();
	}

	@Override
	public void power() {
	System.out.println("Bmw power");
	super.power();
	}
	
}

public class MethodOverriding3 {

	public static void main(String[] args) {
	Bmw b=new Bmw();
	b.power();
	b.speed();
	}

}
