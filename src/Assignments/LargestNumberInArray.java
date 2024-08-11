package Assignments;

import java.util.Scanner;

public class LargestNumberInArray {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the size of the array:");
     int size=sc.nextInt();
     int numbers[]=new int[size];
     System.out.println("Enter the numbers of the array:");
     for(int i=0;i<size;i++)
     {
    	 numbers[i]=sc.nextInt();
     }
     int largest=numbers[0];
     for(int i=1;i<size;i++)
     {
    	 if(numbers[i]>largest)
    	 {
    		 largest=numbers[i];
    	 }
     }
     System.out.println("The largest number in the array is "+largest);
    }
}
