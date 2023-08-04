class Ab{
	public void show() {
		System.out.println("inn A");
	}
}
public class AnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ab obj=new Ab() {
			public void show() {
				System.out.println("inn the best");
			}//one time use anonymous class there is no name for the class
			 
		};
		obj.show();

	}

}
