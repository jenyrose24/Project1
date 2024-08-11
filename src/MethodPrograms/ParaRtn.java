package MethodPrograms;

public class ParaRtn {
	public int sum(int a,int b) {
		int c=a+b;
		return c;
	}

	public static void main(String[] args) {
	ParaRtn Ab=new ParaRtn();
	System.out.println(Ab.sum(10, 100));
	}

}
