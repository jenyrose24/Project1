package Assignments;

public class largestnum_nestedif {

	public static void main(String[] args) {
	int a=220,b=30,c=40;
	if(a>=b)
	{
		if(a>=c)
		{
			System.out.println("a is the largest number");
		}
		else
		{
			System.out.println("c is the largest number");
		}
	}
		else
		{
		if(b>=c)
		{
			System.out.println("b is the largest");
		}
		else
		{
			System.out.println("c is the largest");
		}
		}
	}
	}


