@FunctionalInterface
interface Demoa
{
	int num=8;//varaible  becomes final
	void abc();
	static void show(){
		 System.out.println("Hello");
		
	}
	
}

public class Static_in_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demoa.show();
	}

}
