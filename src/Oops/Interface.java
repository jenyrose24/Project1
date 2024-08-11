package Oops;
//Abstraction using Interface
interface Whatsappcalls
{
	void calls();
	void mute();
	void disconnect();
}
class Audiocalls implements Whatsappcalls
{

	@Override
	public void calls() {
	System.out.println("Whatsappcalls");
	}

	@Override
	public void mute() {
	System.out.println("Whatsappcalls muted");
	}

	@Override
	public void disconnect() {
	System.out.println("whatsppcalls disconnected");
	}
	
}
class Videocalls implements Whatsappcalls
{

	@Override
	public void calls() {
	System.out.println("Videocalls");
	}

	@Override
	public void mute() {
	System.out.println("Videocalls muted");
	}

	@Override
	public void disconnect() {
	System.out.println("Videocalls disconnect");
	}
	
}
public class Interface {

	public static void main(String[] args) {
	/*
	Audiocalls ac=new Audiocalls();					//accessing child classes creating different objects for each
	ac.calls();
	ac.mute();
	ac.disconnect();
	Videocalls vc=new Videocalls();
	vc.calls();
	vc.mute();
	vc.disconnect();
	*/
	
	Whatsappcalls wc=new Audiocalls();				//using interface we can access all the child classes with one object
	wc.calls();
	wc.mute();
	wc.disconnect();
	wc=new Videocalls();
	wc.calls();
	wc.mute();
	wc.disconnect();
	}

}
