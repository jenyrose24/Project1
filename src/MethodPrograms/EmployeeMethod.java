package MethodPrograms;
//pass values to variables using method
public class EmployeeMethod {
	int empid;
	int salary;
	String designation;
	//if u want to use the name for passing variables same as the instance variable
	/*public void setvalues(int empid,int salary,String designation)
	{
		this.empid=empid;
		this.salary=salary;
		this.designation=designation;
		
	}*/
	 public void setvalues(int id,int sal,String desig)
	  {
	  empid=id;
	  salary=sal;
	  designation=desig;
	  }
	 
	
	public void display()
	{
		System.out.println("empid= "+empid);
		System.out.println("salary= "+salary);
		System.out.println("designation= "+designation);
	}

	public static void main(String[] args) {
	EmployeeMethod emp= new EmployeeMethod();
	emp.setvalues(10, 30000, "Tester");
	emp.display();
	}

}
