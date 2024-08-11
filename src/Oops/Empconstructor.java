package Oops;

public class Empconstructor {
	//define instance variable
	int empid;
	int salary;
	String designation;
	
	public Empconstructor()
	{
		empid=1;
		salary=40000;
		designation="Tester";
	}

	public static void main(String[] args) {
	Empconstructor emp=new Empconstructor();
	System.out.println("Empid=" + emp.empid);
	System.out.println("Salary=" +emp.salary);
	System.out.println("Designation=" +emp.designation);
	}

}
