package Assignments;

import java.util.Scanner;

public class VowelCounter {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string:");
	String input=sc.nextLine();
	int vowelCount=0;
	for(int i=0;i<input.length();i++)
	{
		char ch=input.charAt(i);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch== 'E' || ch=='I' || ch=='O' || ch=='U')
		{
			vowelCount++;
			
		}
	}
	System.out.println("Number of vowels in the given string is "+vowelCount);
	}

}
