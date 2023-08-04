
class School{
	int n1,n2,res;//using default constructor memory is allocated to return any thing separate constructor is created
	

public School(){
	n1=5;
	n2=5;
	System.out.println("in constructor--"+n1);
	n1=0;
	
}
public School(int n) {
	n1=n;
	System.out.println("in constructor-"+n1);
}
}
public class Objectdemo {

	public static void main(String[] args) {
		School s=new School();
		System.out.println("in main "+s.n1);
		//using same constructor of different parameters
		School x=new School(10);
		 /*
		  * this represents current object
		  * same variable in a class called as instance variable 
		  * same variable in a constructor called as local variable 
		  * In order to refer through the instance variable then this used(this.n1=n1)
		  */
		
		
		

	}

}
