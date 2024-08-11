package JavaExam;

public class Patternprinting {

	public static void main(String[] args) {
		 int rows = 6; // Number of rows in the pattern

	        // Outer loop for rows
	        for (int i = rows; i >= 1; i--) {
	            // Inner loop for printing numbers
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j + " ");
	            }
	            System.out.println(); // Move to the next line after each row
	        }
	}

}
