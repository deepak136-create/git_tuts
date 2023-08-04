package deepak.oops;
class A
{
	
	public A()
	{
		// TODO Auto-generated constructor stub
		
		System.out.println("in A");
	}
	public A(int i)
	{
		
		System.out.println("in A int ");

	}
	
}
class B extends A {
	public B() {
	// TODO Auto-generated constructor stub
		super();
		System.out.println("in B  ");

	}
	public B(int i) {
		super(i);
		System.out.println("in  B int ");
	
			
		}
	
}

public class SuperDemo {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj1=new B(5);
	}

}
