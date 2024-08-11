package Oops;
class Encap
{
	private String name;
	private String designation;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
}
public class Encapsulationpgm {

	public static void main(String[] args) {
	Encap ob=new Encap();
	ob.setName("Anu");
	System.out.println(ob.getName());
	ob.setDesignation("Tester");
	System.out.println(ob.getDesignation());
	}

}
