package Oops;
class SchoolDetails
{
	final String schoolname="Luminar";
	static String department="English";
}
public class StaticFinal {
	
	public static void main(String[] args) {
	System.out.println(SchoolDetails.department);				//static variables can be accessed without obj creation
	System.out.println(SchoolDetails.department="Malayalam");	//static variables can be changed
	System.out.println(SchoolDetails.department);				//one time memory allocation -static
	//System.out.println(SchoolDetails.);						//without obj creation can't access final variables
	SchoolDetails ob=new SchoolDetails();
	System.out.println(ob.schoolname);
	//System.out.println(ob.schoolname="abc");					//final variables cannot be changed
	}

}
