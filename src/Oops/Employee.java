package Oops;

public class Employee {

	int empId;
	String Empname;
	String designation;
	int deptno;
	public void display()
	{
	System.out.println(empId);
	System.out.println(Empname);
	System.out.println(designation);
	System.out.println(deptno);
	}
	
	
	public static void main(String[] args) {
		Employee emp= new Employee();
		emp.deptno=1;
		emp.designation="Tester";
		emp.empId=100;
		emp.Empname="Anu";
		emp.display();
		
		
		
		
		

	}

}
