package Assignments;

public class MatrixAddition {

	public static void main(String[] args) {
	int a[][]= {{1,2,3},{4,3,5},{2,4,1}};
	int b[][]= {{3,1,2},{5,2,3},{3,5,2}};
	int c[][]=new int[3][3];
	System.out.println("Resulting Matrix after addition:");
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			c[i][j]=a[i][j]+b[i][j];
			System.out.print(c[i][j]+" ");
		}
		System.out.println();
	}
	}

}
