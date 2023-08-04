package deepak.oops;

class C
{
	public void show()
	{
		// TODO Auto-generated constructor stub
		System.out.println("in A");
	}
	public void show(int i)
	{
		
		System.out.println("in A int ");

	}
	
}
class D extends C {
	@Override
	public void show1()//even though error gets into a and gives compile time error
	{
		// TODO Auto-generated constructor stub
		System.out.println("in B");
	}
	
	public void show(int i)
	{
		super.show(i);

		System.out.println("in B int ");

	}
	
}
public class OverrideDemo {

	//over ride the super class method using sub class method is called overriding
	public static void main(String[] args) {
		D obj1=new D();
		obj1.show();
		obj1.show(5);
	}

}
