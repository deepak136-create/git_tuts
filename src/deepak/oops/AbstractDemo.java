package deepak.oops;

abstract class Human{
	public abstract void eat() ;
	public void walk() {
		
	}
	
}
class Man extends Human{//man is concrete class and human is abstract class
	public void eat() {
		
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		// class method is used then class needs to be abstract
		Human h1=new Man();
		//Human h1=new Human();//if class is made abstract then no one able to create objec of it as same way done for method
	}

}
