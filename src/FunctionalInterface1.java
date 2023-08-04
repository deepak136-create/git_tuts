/*@FunctionalInterface
interface Abcd{
	void show();
}
class Ab{
	public void show() {
		System.out.println("inn A");
	}
}
public class FunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abcd obj=()-> System.out.println("inn the best");//lambda expression
		
		obj.show();

	}

}*/

//using default method
/*Abstract class-Define and declare
 * Interface declare methods
 * 1.8 can deffne in interface
 * */
@FunctionalInterface
interface Demo
{
	
	void abz();
	default void show() 
	{
		System.out.println("in  demo show");
	}
}
interface Mydemo
{
	
	
	default void show() 
	{
		System.out.println("in my demo show");
	}
}
class Demoimp implements Demo,Mydemo
{
	public void abz() 
	{
		System.out.println("in abz");
	}

	@Override
	public void show() {
		// TODO Auto-ge nerated method stub
		Demo.super.show();
	}
	
	
}
public class FunctionalInterface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo obj=new Demoimp();		
		obj.abz();
		obj.show();

	}

}

