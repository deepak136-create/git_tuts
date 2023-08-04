
class Calc1
{
	public int add(int ...n) {
		int sum=0;
				for(int i:n) {
					sum=sum+i;
				}
		return sum;
	}
	public int sub(int ...n) {
		int sub=100;
		for(int i:n) {
			sub=sub-i;
		}
return sub;
	}
}
public class Varargs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc1 obj=new Calc1();
		System.out.println(obj.add(4,22222222,5,6));
		System.out.println(obj.sub(10,10,10,60));
		

	}
	//by general method we  use some variable to do some operations like addition by variables may increase as a reason use varargs

}
