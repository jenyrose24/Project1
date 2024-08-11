package MethodPrograms;

public class A_rectangle {
	//without parameter & with return type
	public double area() {
		double l=12.3;
		double b=8.45;
		double result=l*b;
		return result;
	}

	public static void main(String[] args) {
	A_rectangle ar=new A_rectangle();
	System.out.println("Area= "+ar.area());
	}

}
