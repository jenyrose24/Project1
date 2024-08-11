package MethodPrograms;

public class A_square {
	//without parameter & without return type
	public void area() {
		int a=10;
		int result=a*a;
		System.out.println("Area= "+result);
	}

	public static void main(String[] args) {
	A_square ab= new A_square();
	ab.area();
	}

}
