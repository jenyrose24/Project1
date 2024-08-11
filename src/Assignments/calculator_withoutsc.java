package Assignments;

public class calculator_withoutsc {

	public static void main(String[] args) {
		float num1 = 140;
        float num2 = 2;
        char operator = '+';
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
                System.out.println("Invalid operator!");
                return;
        }

        System.out.println("The result is: " + result);

	}

}
