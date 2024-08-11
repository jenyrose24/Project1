package basics;

public class operators_work {

	public static void main(String[] args) {
	//check if 23=45
	int d=23;
	int e=45;
	System.out.println(d==e);
	
	//check if both conditions are true (a<50 & a<b)
	int a=55;
	int b=70;
	System.out.println(a<50 && a<b);

	//print the second digit of the number
	int c=17;
	System.out.println(c%10);
	
	//Area of a rectangle
	int length=12;
	int breadth=10;
	System.out.println("Length of the rectangle= " + length);
	System.out.println("Breadth of the rectangle= " + breadth);
	System.out.println("Area of the rectangle= "+ (length*breadth));
	
	//Area of a square
	int side=25;
	System.out.println("Side of the square= " + side);
	System.out.println("Area of square= "+ (side*side));
	
	}

}
