
class Calc{
	int n1,n2,res;
	

 public void perform(){
	 //method
	 res=n1+n2;
 }
}
class Construct1 {

	public static void main(String[] args) {
		//Calc obj; //reference
		Calc obj=new Calc();//new Calc() is obj new allocates memory object knows something and does something
		obj.n1=5;
		obj.n2=3;
		System.out.print("Default value of result is"+obj.res);
		obj.perform();
		System.out.print("final value of result is"+obj.res);
		//object requires main
		// constructor is a member method---Use is allocates memory 
		// constructor has same class name and not return anything so use public default constructor is created when class is created
		// default values can be set using constructors
		// having different constructors with different parameters is called constructor overloading
		//call same constructors  parameters play good role
	}

}
