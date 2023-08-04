package deepak.oops;
class Student{
	private int rollno;   
	private String Name;
	
	public int getRollno() {
		System.out.println("user is accesing value");

		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
		System.out.println("roll number updated !");
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Student s1=new Student();
		 s1.setRollno (2);
		 s1.setName("Deepak");
		 System.out.println(s1.getRollno());
		 System.out.println(s1.getName());

	}

}
