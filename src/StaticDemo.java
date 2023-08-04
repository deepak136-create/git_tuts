class Emp{
	int eid,salary;
	static String ceo;//dont want a variable to be object specific it goes into class loader memory not goes into heap
	static {
		ceo="Deepak";
		System.out.println("in static");
	}
public  Emp() {
	eid=100;
	salary=5000;
	System.out.println("in constructor");
}

public void  show() {
	System.out.println(eid+"-- "+salary+"-- "+ceo);

}
}
public class StaticDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Emp navin=new Emp();
		/*1 navin.salary=100000;
		navin.eid=1001;
		navin.ceo="Karthik";*/
		Emp rahul=new Emp();
		/* 1 rahul.salary=150000;
		rahul.eid=1002;
		Emp.ceo="nikhil";*/
		//rahul.ceo="nikita"; we can use class name because it applicable for every object in the class
		navin.show();
		rahul.show();
	}
//Generally static is used before main method it implies that no need object to call main static same for all objects
	    
//special static block used to static variables non static variables called using constructors
//cannot use non static variables in static block
}

