package Assignments;

public class ReverseString {

	public static void main(String[] args) {
	String str="Hello";
	String reverseStr=" ";
	String r=reverseStr;
	
	for(int i=0;i<str.length();i++)
	{
		r=str.charAt(i)+r;		//0=H+0=H, e+H=eH, l+eH=leH, l+leH=lleH, o+lleh=olleH
	}
	System.out.println("Reversed String:"+r);
	}

}

