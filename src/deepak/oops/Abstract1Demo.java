package deepak.oops;
	class Printer{
		public void show(Number i) {
	
		// TODO Auto-generated method stub
		System.out.println(i);
		}
		
	
	 
	}//make class as abstract not to create the object by using this we can any class inside using single object use pen pencil extends writer
	
public class Abstract1Demo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer obj=new Printer();
		obj.show(5.5f);

	}

}
