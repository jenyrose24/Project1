package Assignments;

public class CountWhile {
	// get the count of 1234 using while loop
	public static void main(String[] args) {
	int a=1234;
	int count=0;
	
	while(a>0)
	{
		a=a/10; //123//12/1/0
		count++; //1//2//3//4

	}
	
	System.out.println("Count=" + count);

	}
}
