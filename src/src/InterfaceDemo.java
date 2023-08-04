/*interface Writer{
	public abstract void write();//nomention public abstract created by default
}
class Pen implements Writer {
	public void write() {
	System.out.println("i am a pen");
	}
}

class Pencil implements Writer{
	public void write() {
		System.out.println("i am a pencil");

	}

	
}
class Kit {
	public void dosomething( Writer p) {
		p.write();
		
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kit k=new Kit();
		Writer p=new Pen();
		Writer  pc=new Pencil();
		k.dosomething(pc);//if we pc instad p returns error try to create new class then extend it to next classes
		//there is no method to mention dosomething(pc) 
		//using implements in interface
		//interface is same as abstarct class in which only abstract  methods are there
		//no object can be defined for interface able to use as refaerance
	}

}**/
/*interface Abc{
	void show();//unable to define the work of method try to implement the class and define method
}
class Implim implements Abc{
	public void show() {
		System.out.println("Anything");
}
}
public class InterfaceDemo{
	

	public static void main(String[] args) {
		
		Abc i=new Implim();
		i.show();
		
	}
}*/
// use of anonymous calss in interface
interface Abc{
	void show();//unable to define the work of method try to implement the class and define method
}
/*class Implim implements Abc{
	public void show() {
		System.out.println("Anything");
}
}*/
public class InterfaceDemo{
	

	public static void main(String[] args) {
		
		Abc i=new Abc() {
			public void show() {
				System.out.println("in Anything");
		}
		};
		i.show();
		
	}
}

/*
 * Types of the interfaces 
 * 1.Normal -more than 1 method
 * 2.Single abstract method -1method-Lamda Expression -Functional interface works from java 8 
 * 3.Marker interface
 */
 