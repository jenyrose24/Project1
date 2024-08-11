package JavaExam;
class Classroom
{
	int rollNo;
	String name;
	int mark;
	
	public void Store(int rollNo,String name,int mark) {
		this.rollNo=rollNo;
		this.name=name;
		this.mark=mark;
	}
	public void Display()
	{
		System.out.println("Roll Number:"+rollNo);
		System.out.println("Name:"+name);
		System.out.println("Marks:"+mark);
	}
}
public class ClassroomDetails {

	public static void main(String[] args) {
	Classroom ob=new Classroom();
	ob.Store(10, "Anu", 98);
	ob.Display();
	}

}
