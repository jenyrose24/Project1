package Inheritance;
class Members
{
	String name;
	int age;
	String address;
	double salary;

//method to print details
public void printdetails()
{
	System.out.println("Name:"+name);
	System.out.println("Age:"+age);
	System.out.println("Address:"+address);
	System.out.println("Salary:"+salary);
}
}
class Worker extends Members
{
	String specialization;
}

class Manager extends Members
{
	String department;
}

public class EmpDetails {

	public static void main(String[] args) {
		Worker wo=new Worker();
		wo.name="Martin";
		wo.age=27;
		wo.address="Ekm kl";
		wo.salary=50000;
		wo.specialization="Electrical";
		wo.printdetails();
		System.out.println("specialization:"+wo.specialization);
		Manager ma=new Manager();
		ma.name="Jane";
		ma.age=34;
		ma.address="Thrissur kl";
		ma.salary=70000;
		ma.department="HR";
		ma.printdetails();
		System.out.println("department:"+ma.department);
		
	}

}
