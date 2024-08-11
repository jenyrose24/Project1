package Array;

import java.util.Scanner;

public class TwoDarray_foreach {

	public static void main(String[] args) {
		int arr[][]=new int[3][2];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur values: ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Entered values: ");
		for(int a[]:arr)    //a[]=2 3 4//to print values
		{
			for(int v:a)    //v=2//v=3//v=4
			{
				System.out.print(v+" ");
			}
			System.out.println();
		}
		
	}

}
