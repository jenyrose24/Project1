package Oops;

interface Bank1
{
	void deposit();
	void withdraw();
}

interface Bank2
{
	void interestrate();
	void balancedetails();
}
class ICICI implements Bank1,Bank2
{

	@Override
	public void interestrate() {
		System.out.println("Interest rate");
	}

	@Override
	public void balancedetails() {
		System.out.println("Balance details");
	}

	@Override
	public void deposit() {
		System.out.println("Deposit");
	}

	@Override
	public void withdraw() {
		System.out.println("Withdraw");
	}
	
}
public class MultipleInheritance {

	public static void main(String[] args) {
	ICICI b=new ICICI();
	b.interestrate();
	b.balancedetails();
	b.deposit();
	b.withdraw();
	}

}
