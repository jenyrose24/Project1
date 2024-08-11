package JavaExam;
interface Principal{
	public void resign();
	public void rejoin();
}
class Students
{
	public void marks()
	{
		System.out.println("Marks");
	}
	public void ShowDetails()
	{
		System.out.println("Show Details");
	}
}
class Teacher extends Students implements Principal
{
	public void Department() {
		System.out.println("Department");
	}
	public void resign()
	{
		System.out.println("Resigned");
	}
	public void rejoin()
	{
		System.out.println("Rejoined");
	}
}
public class StudentDetails {

	public static void main(String[] args) {
		Teacher ob= new Teacher();
		ob.marks();
		ob.ShowDetails();
		ob.Department();
		ob.resign();
		ob.rejoin();
	}

}
