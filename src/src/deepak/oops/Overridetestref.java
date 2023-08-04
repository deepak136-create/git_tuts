package deepak.oops;

class x
{
	public void show()
	{
		// TODO Auto-generated constructor stub
		System.out.println("in x");
	}
	
	
}
class y extends x {
	
	public void show()//even though error gets into a and gives compile time error
	{
		// TODO Auto-generated constructor stub
		System.out.println("in y");
	}
	
}
class z extends x {
	
	public void show()//even though error gets into a and gives compile time error
	{
		// TODO Auto-generated constructor stub
		System.out.println("in z");
	}
	
}



public class Overridetestref {

	//compile time run time
		public static void main(String[] args) {
		x obj1=new y();//reference is x and implementation of y runtime polymorphism 
		obj1.show();
		
		obj1=new z();//Dynamic Method Dispatch follow run time no need of call x 
		obj1.show();
		
	}
	
}


