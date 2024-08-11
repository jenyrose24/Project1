package Assignments;

public class Paliandrome {

	public static void main(String[] args) {
	int n=121;		
	System.out.println("n="+n);
	int temp=n;
	int rev=0,r;
	while(n>0)	//121>0, 12>0, 1<0, 0.1>0--exit loop
	{
	r=n%10;			//getting remainder 121%10=1, 12%10=2, 1%10=1
	rev=(rev*10)+r; //(0*10)+1=1, (1*10)+2=12, (12*10)+1=121
	n=n/10;			//121/10=12, 12/10=1, 1/10=0.1
	
	}
	System.out.println("rev="+rev);
	if(rev==temp)
	{
		System.out.println("paliandrome");
	}
	else
	{
		System.out.println("not paliandrome");
	}
	}
	
}
