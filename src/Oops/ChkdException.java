package Oops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ChkdException {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
	FileInputStream f=new FileInputStream("E://Book.xlsc");
	System.out.println("STARTED");
	Thread.sleep(5000);
	System.out.println("STOPPED");
	}

}
