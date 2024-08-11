package Inheritance;
//multi level inheritance
class Dog1
{
	public void barking()
	{
		System.out.println("Dog is barking");
	}
}
class Cat1 extends Dog1
{
	public void sleeping()
	{
		System.out.println("Cat is sleeping");
	}
}
class Lion extends Cat1
{
	public void running()
	{
		System.out.println("Lion is running");
	}
}

public class Multi_inheritance {

	public static void main(String[] args) {
	Lion l=new Lion();
	l.barking();
	l.sleeping();
	l.running();
	}

}
