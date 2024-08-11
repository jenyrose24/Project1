package Oops;
abstract class Google
{
abstract void message();
static int a=30;
public void search() {
	System.out.println("search details");
}
}
class SearchAll extends Google
{

	@Override
	void message() {
	System.out.println("search all results");
	}
	
}
class SearchImages extends Google
{

	@Override
	void message() {
	System.out.println("search all images");
	}
	
}
class SearchVideos extends Google
{

	@Override
	void message() {
	System.out.println("search all videos");
	}
	
}

public class Abstraction {

	public static void main(String[] args) {
	SearchAll sa=new SearchAll();
	sa.search();
	sa.message();
	SearchImages si=new SearchImages();
	sa.search();
	si.message();
	SearchVideos sv=new SearchVideos();
	sv.search();
	sa.message();
	System.out.println(Google.a);
	}

}
