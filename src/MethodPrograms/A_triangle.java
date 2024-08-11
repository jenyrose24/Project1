package MethodPrograms;

public class A_triangle {
	//with parameter & without return type
	public void area(double b,double h) {
		double result=0.5*b*h;
		System.out.println("Area= "+result);
	}
	public static void main(String[] args) {
	A_triangle at=new A_triangle();
	at.area(12, 3);
	
	}

}
