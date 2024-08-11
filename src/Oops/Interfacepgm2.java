package Oops;
interface basicanimal
{
	public void cat();
	public void sleep();
}
class Monkey
{
	
public void jump()
{
	System.out.println("jump");
}
public void bite()
{
	System.out.println("bite");
}
}

class Human extends Monkey implements basicanimal
{
public void speak()
{
	System.out.println("speak");
}

@Override
public void cat() {
System.out.println("cat");
	
}

@Override
public void sleep() {
	System.out.println("sleep");
	
}
}
public class Interfacepgm2 {

	

	public static void main(String[] args) {
	Human b=new Human();
	b.bite();
	b.cat();
	b.jump();
	b.sleep();
	b.speak();
	}
}

		
	


