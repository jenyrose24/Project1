package Assignments;

import java.util.Scanner;

public class PrimenoChck {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number: ");
	int num=sc.nextInt();
	int count=0;
	for(int i=2;i<=num/2;i++)
	{
		if(num%i==0)
		{
		count++;
		break;
		}
	}
	if(count==0 && num>1)
	{
		System.out.println(num+" is a prime number");
	}
	else
	{
		System.out.println(num+" is not a prime number");
	}

}
	}
