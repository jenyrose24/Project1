package Jump_statements;

import java.util.Scanner;

public class Scanner_class {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your age: ");
	int age=sc.nextInt();
	System.out.println("Enter your name: ");
	String name=sc.next();
	System.out.println("Enter a character: ");
	char c=sc.next().charAt(0);
	}

}
