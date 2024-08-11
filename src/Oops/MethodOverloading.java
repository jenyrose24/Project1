package Oops;
//methodOverloading with same name but different arguments 

public class MethodOverloading {
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public void add(int a,int b,int c)
	{
		int d=a+b+c;
		System.out.println(d);
	}

	public static void main(String[] args) {
	MethodOverloading ov=new MethodOverloading();
	ov.add(3, 5);
	ov.add(1, 9, 5);
	}

}
