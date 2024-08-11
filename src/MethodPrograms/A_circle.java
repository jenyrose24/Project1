package MethodPrograms;

public class A_circle {
	//with parameter & with return type
	public double area(double r) {
		double result=3.14*r*r;
		return result;
	}

	public static void main(String[] args) {
	A_circle ac= new A_circle();
	System.out.println("Area= "+ac.area(6));
	}

}
