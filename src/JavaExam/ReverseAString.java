package JavaExam;

public class ReverseAString {

	public static void main(String[] args) {
	
	String str="World";
	String reverseStr=" ";
	String r=reverseStr;
	System.out.println("Input String:"+str);
	
	for(int i=0;i<str.length();i++)
	{
		r=str.charAt(i)+r;		
	}
	System.out.println("Reversed String:"+r);
	
	}

}
