package Array;

import java.util.Scanner;

public class Onedimensional_array {

	public static void main(String[] args) {
		int number = 0;
	int a[]=new int[6]; //declare array
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your numbers: ");
	for(int i=0;i<6;i++) //i=index no.//to read numbers
	{
		a[i]=sc.nextInt(); //store values to array
	}
	//System.out.println("Entered no's are: ");
	for(int i=0;i<6;i++) //to print the numbers
	{
		if (number % 2 != 0) {
            System.out.print(number + " ");
        }
		System.out.println(a[i]);
	}
	}

}
