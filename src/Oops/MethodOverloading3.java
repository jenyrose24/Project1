package Oops;
//methodOverloading with different order of parameters

public class MethodOverloading3 {
	public void add(int a,double b)
	{
		double c=a+b;
		System.out.println(c);
		
	}
	public void add(double a,int b)
	{
		double d=a+b;
		System.out.println(d);
	}

	public static void main(String[] args) {
	MethodOverloading3 mov=new MethodOverloading3();
	mov.add(2, 5.4);
	mov.add(1.1, 7);
	}

}
