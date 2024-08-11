package Assignments;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number:");
	int factorial=1;
	int num=sc.nextInt();
	for(int i=1;i<=num;i++) {
		factorial=factorial*i;
	}
	System.out.println("factorial of the given number is "+factorial);
	}

}
