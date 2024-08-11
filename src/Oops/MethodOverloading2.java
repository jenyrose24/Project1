package Oops;
//methodOverloading with different datatypes

public class MethodOverloading2 {
	public void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	public void add(int a,double b) {
		double d=a+b;
		System.out.println(d);
	}

	public static void main(String[] args) {
	MethodOverloading2 mo=new MethodOverloading2();
	mo.add(23, 45);
	mo.add(2, 7.8);
	}

}
