package Oops;

public class TryCatch {

	public static void main(String[] args) {
	int a=10,b=0;
	try
	{
		int c=a/b;
		System.out.println(c);
	}
	catch(Exception e)
	{
		//System.out.println("arithmetic exception");
		System.out.println(e.getMessage());		//if you don't know the exception
	}
	System.out.println("completed");
	}

}
