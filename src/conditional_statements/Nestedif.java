package conditional_statements;

public class Nestedif {

	public static void main(String[] args) {
	int age=25,weight=50;
	if(age>=18)
	{
		if(weight>50)
		{
			System.out.println("eligible");
		}
		else
		{
			System.out.println("ineligible:under weight");
		}
	}
	else
	{
		System.out.println("not eligible");
	}
	}

}
