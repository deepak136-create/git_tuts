class Outer{
	static int a;//member variable
	 public static  void show()//member method
	{
		
	}
	
	static class Inner
	{//member class becomes static Outer$Inner.class
		public void display(){
			System.out.println("in display");

		}
	}
	
}
public class InnerDemo {
	//variable,method,class
	public static void main(String[] args) {
		Outer obj=new Outer();
		obj.show();
		//Outer.Inner obj1=obj.new Inner(); non static inner class
		//obj1.display();
		Outer.Inner obj1=new Outer.Inner();//no need to call object
		obj1.display();
		
	}
	
	

}
