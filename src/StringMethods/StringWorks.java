package StringMethods;

public class StringWorks {

	public static void main(String[] args) {
	//concatenate given string 
	String s="jmeter";
	String s1=" performance testing tool";
	System.out.println(s.concat(s1));
	
	
	
	
	
	
	//Check the string is present, if true print pass else fail
	String c="java language is platform independent";
	if(c.contains("language"))
	{
		System.out.println("PASS");
	}
	else
	{
		System.out.println("FAIL");
	}
	
	
	
	
	
	
	
	//Split the given string & print all words, if "webapplication" is present stop execution
	String s3="selenium webdriver is used for webapplication testing";
	String words[]=s3.split(" ");
	for(String l:words)
	{
		System.out.println(l);
		if(l.contains("webapplication"))
		{
			break;
		}
	}
	}

}
