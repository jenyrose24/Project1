package StringMethods;

public class Eg_programs {

	public static void main(String[] args) {
	//length of a string
		String s="welcome";
		System.out.println(s.length());
		//int w=s.length();
		//System.out.println("length:"+w);
		
		//to join 2 strings
		String s1="hello";
		String s2="Luminar";
		System.out.println(s1.concat(s2));
		
		System.out.println(s1+s2);
		System.out.println(s1+1+2);
		System.out.println(1+2+s1);
		
		String a5="Luminar";
		System.out.println(a5.toLowerCase());
		System.out.println(a5.toUpperCase());
		System.out.println(a5.startsWith("u"));
		System.out.println(a5.endsWith("r"));
		
		//compare 2 strings
		String a="abc";
		String b="Abc";
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		
		//to trim white spaces
		String q="  hello";
		System.out.println(q);
		System.out.println(q.trim());
		
		//to extract a particular portion from the string
		String y="welcome";
		System.out.println(y.substring(3));
		System.out.println(y.substring(0, 4));
		
		//to check wheather the particular string is in the given input string
		String x="welcome to Luminar";
		System.out.println(x.contains("luminar"));
		
		//to replace a string
		System.out.println(x.replace("el", "xy"));
		
		//to fetch a character of particular index from the string
		String z="welcome";
		System.out.println(z.charAt(3));
		
		//to split a string
		String w1="Welcome to Luminar";
		String words[]=w1.split(" ");
		for(String l:words)
		{
			System.out.println(l);
		}
		
		//to split all the characters in a string
		String t="Hello";
		char c1[]=t.toCharArray();
		for(char v:c1)
		{
			System.out.println(v);
		}
	}

}
