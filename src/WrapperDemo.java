//int float double 
public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i=5;//primitive data type as i is normal variable turn into as a class as reference variable
		
		
		Integer ii= new Integer(i);//boxing -wrapping
		
		
		
		int j=ii.intValue();//unboxing-unwrapping
		
		
		Integer value= i;//Auto boxing

		
		
		
	int k=value;//auto unboxing
	String str="123";
	int n=Integer.parseInt(str);
	
	System.out.println(n);}

}
