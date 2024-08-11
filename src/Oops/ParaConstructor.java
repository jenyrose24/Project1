package Oops;

public class ParaConstructor {
	int empid;
	int salary;
	String designation;
	
	//using same name for both paasing variables and instance variable
	/*public ParaConstructor(int empid,int salary,String designation)
	{
		this.empid=empid;
		this.salary=salary;
		this.designation=designation;
	}
	*/
	//using different names for variables
	public ParaConstructor(int id,int sal,String desig)
	{
		empid=id;
		salary=sal;
		designation=desig;
	}


	public static void main(String[] args) {
	ParaConstructor emp=new ParaConstructor(100,30000,"Developer");
	System.out.println("Empid="+emp.empid);
	System.out.println("Salary="+emp.salary);
	System.out.println("Designation="+emp.designation);
	}

}
