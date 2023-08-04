class A{
	final int I;

	public A() {
		I=20;
		
	}
}
public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj1=new A();
		
		System.out.println(obj1.I);//final treats as permanent we can initialise a variable(becomes as constant) ,class(no one extends it),method(no one can override )
	}

}   
