package Oops;

public class TryCatchFinally {

	public static void main(String[] args) {
	System.out.println("started");
	try
	{
		int i=10;
		//System.out.println(i); //no exception
		System.out.println(i/0); //error occurs
	}
	catch(ArithmeticException e) 		//works only if exception in try
	{
		System.out.println(e.getMessage());
	}
	finally								//works even if there is no exception in try
	{
		System.out.println("This is finally");
	}
	System.out.println("stopped");
	}

}
