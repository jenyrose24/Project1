package Assignments;

import java.util.Scanner;

public class calculator_withsc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        float num1 = sc.nextFloat();

        System.out.print("Enter the second number: ");
        float num2 = sc.nextFloat();
        
        System.out.print("Enter the operation (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        float result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operation");
                return;
        }
        System.out.println("The result is: " + result);
	}

}
