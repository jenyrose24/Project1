package Inheritance;
//Hierarchial inheritance
class Dog2
{
	public void barking()
	{
		System.out.println("Dog is barking");
	}
}
class Cat2 extends Dog2
{
	public void sleeping()
	{
		System.out.println("Cat is sleeping");
	}
}
class Lion2 extends Dog2
{
	public void running()
	{
		System.out.println("Lion is running");
	}
}

public class Hierarchial_inheritance {

	public static void main(String[] args) {
	Cat2 c=new Cat2();
	c.barking();
	c.sleeping();
	
	}

}
